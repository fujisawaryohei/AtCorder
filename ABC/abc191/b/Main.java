package ABC.abc191.b;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if(n != X) {
                list.add(n);
            }
        }

        if(list.isEmpty()) {
            System.out.println("");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) sb.append(' ');
                sb.append(list.get(i));
            }
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
