package ABC.abc167.c;

import java.util.Scanner;

public class Main {
    static int bk_n, alg_m, lvl_x;
    static long ans;
    static int[] costs;
    static int[][] lvls;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bk_n = sc.nextInt();
        alg_m = sc.nextInt();
        lvl_x = sc.nextInt();

        costs = new int[bk_n];
        lvls = new int[bk_n][alg_m];

        for (int i = 0; i < bk_n; i++) {
            costs[i] = sc.nextInt();
            for (int j = 0; j < alg_m; j++) {
                lvls[i][j] = sc.nextInt();
            }
        }

        ans = (long)1e18;
        dfs(0, 0, new int[alg_m]);

        if (ans == (long)1e18) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }

        sc.close();
    }

    static void dfs(int i, long cost, int[] sum) {
        if(i == bk_n) {
            boolean ok = true;
            for (int j = 0; j < alg_m; j++) {
                if (sum[j] < lvl_x) {
                    ok = false;
                    break;
                }
            }
            if(ok) ans = Math.min(ans, cost);
            return;
        }
        // 本iを買わない
        dfs(i + 1, cost, sum);

        // 本iを買う
        int[] sum2 = sum.clone();
        for(int j = 0; j < alg_m; j++) {
            sum2[j] += lvls[i][j];
        } 
        dfs(i + 1, cost + costs[i], sum2);
    }
}