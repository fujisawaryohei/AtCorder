package ABC.abc157.b;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        int N = sc.nextInt();
        Set<Integer> called = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            called.add(sc.nextInt());
        }
        
        boolean[][] marked = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(called.contains(A[i][j])) {
                    marked[i][j] = true;
                }
            }
        }

        boolean bingo = false;

        for (int i = 0; i < 3; i++) {
            if (marked[i][0] && marked[i][1] && marked[i][2]) {
                bingo = true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (marked[0][j] && marked[1][j] && marked[2][j]) {
                bingo = true;
            }
        }

        if (marked[0][0] && marked[1][1] && marked[2][2]) {
            bingo = true;
        }

        if (marked[0][2] && marked[1][1] && marked[2][0]) {
            bingo = true;
        }

        System.out.println(bingo ? "Yes" : "No");
        sc.close();
    }
}