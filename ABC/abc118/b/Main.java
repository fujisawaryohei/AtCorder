package ABC.abc118.b;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();

            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < a; j++) {
                int b = sc.nextInt();
                list.add(b);
            }
            lists.add(list);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= m; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < lists.get(i).size(); j++) {
                int t = lists.get(i).get(j);
                map.put(t, map.get(t) + 1);
            }
        }

        int ans = 0;
        for(int i = 0; i <= m; i ++) {
            if(map.get(i) == n) { ans = ans + 1; }
        }

        System.out.println(ans);

        sc.close();
    }
}
