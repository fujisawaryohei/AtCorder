package ABC.abc205.b;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.sort(list);

        boolean ok = true;
        for (int i = 0; i < N; i ++) {
            if(list.get(i) != i + 1) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "Yes" : "No");
        sc.close();
    }
}