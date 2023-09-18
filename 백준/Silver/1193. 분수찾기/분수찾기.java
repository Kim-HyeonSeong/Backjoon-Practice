import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a=1,b=1, N=0;
		int count=0;
		
		if(num==1) {
			System.out.println("1/1");
		}else {
			while(count<num) {
				N++;
				count=N*(N+1)/2;
			}
			int i = num-(N-1)*N/2;
			if(N%2==0) { //짝수 행일시
				a = i;
				b = N-i+1;
			}else {
				a = N-i+1;
				b = i;
			}
			System.out.println(a+"/"+b);
		}
	}
}