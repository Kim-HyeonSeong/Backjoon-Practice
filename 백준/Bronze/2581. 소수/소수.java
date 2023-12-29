import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
		int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = 0;
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == 0 || i < min) {
                    min = i;
                }
            }
        }
        
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    // 소수인지 확인하는 함수
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
