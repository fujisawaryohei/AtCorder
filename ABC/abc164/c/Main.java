package ABC.abc164.c;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> products = new HashSet<String>();
        
        for (int i = 0; i < n; i++) {
            String product = sc.next();
            products.add(product);
        }

        System.out.println(products.size());
        sc.close();
    }
}
