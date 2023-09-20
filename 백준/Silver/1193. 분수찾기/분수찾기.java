import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken()); //구하고자 하는 수
		
		int a=0; //분자
		int b=0; //분모
		int Max=1; //분자 또는 분모의 최대치
		int count=1; //count를++시켜서 num이랑 같으면 수행 종료
		int sum=0; //sum의 숫자를 증가시키거나 감소시켜서 반복시킴
		
		while(count<=num) {
			if(Max%2==1) {
				a=Max-sum;
				b=1+sum;
			}else {
				a=1+sum;
				b=Max-sum;
			}
			if(Max==(1+sum)) {
				Max++;
				sum=0; 
			}else sum++;
			count++;
		}
		System.out.println(a+"/"+b);
	}
}