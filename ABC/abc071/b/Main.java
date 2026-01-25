package ABC.abc071.b;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] s = sc.next().split("");
            Set<Character> set = new HashSet<Character>();
    
            for (int i = 0; i < s.length; i++) {
                char c = s[i].charAt(0);
                set.add(c);
            }
            for (int i = 0; i < 26; i++) {
                char c = (char)('a' + i);
                if(!set.contains(c)) {
                    System.out.println(c);
                    return;
                }
            }
            
            System.out.println("None");
            sc.close();
        }
    }
}
