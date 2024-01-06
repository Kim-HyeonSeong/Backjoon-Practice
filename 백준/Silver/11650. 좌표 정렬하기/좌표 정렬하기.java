import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coordinates = new int[n][2];

        for (int i = 0; i < n; i++) {
            coordinates[i][0] = sc.nextInt(); // x 좌표 입력
            coordinates[i][1] = sc.nextInt(); // y 좌표 입력
        }

        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) { // x 좌표가 같으면 y 좌표로 비교
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]); // x 좌표로 비교
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
    }
}