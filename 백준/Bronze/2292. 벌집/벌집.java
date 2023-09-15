import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int x = 0;
		
		if(num==1) {
			x = 1;
		}else {
			while(num>1) {
				num = num-(6*x);
				x++;
			}
		}
		System.out.println(x);
	}
}