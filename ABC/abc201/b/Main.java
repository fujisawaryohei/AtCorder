import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static class Mountain {
        private String name;
        private int height;

        public Mountain(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Mountain> mountains = new ArrayList<Mountain>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            Mountain mountain = new Mountain(name, height);
            mountains.add(mountain);
        }

        Collections.sort(mountains, (a, b) -> b.height - a.height);

        System.out.println(mountains.get(1).getName());

        sc.close();
    }
}