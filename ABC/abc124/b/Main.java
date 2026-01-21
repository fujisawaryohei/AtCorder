package ABC.abc124.b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];

        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }

        int viewable = 0;
        int maxH = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] >= maxH) {
                viewable++;
                maxH = heights[i];
            }
        }

        System.out.println(viewable);
        sc.close();
    }
}
