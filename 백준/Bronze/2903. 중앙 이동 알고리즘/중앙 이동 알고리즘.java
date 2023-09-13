import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 2;
		int y = 0;
		int result = 0;
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			y = (x+x-1);
			x = y;
			result = y*y;
		}
		System.out.println(result);
	}		
}