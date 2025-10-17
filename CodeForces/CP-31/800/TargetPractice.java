import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int t=0; t<T; t++){

            int total = 0;
            char[][] grid = new char[10][10];

            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid[i][j] == 'X') {
                        int dist = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        total += dist + 1;
                    }
                }
            }

            System.out.println(total);

        }
    }
}
