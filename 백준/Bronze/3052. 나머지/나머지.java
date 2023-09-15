import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int count = 0;
        int[] arr = new int[10];
    
        for(int i = 0; i < 10; i++) {
    	    StringTokenizer st = new StringTokenizer(br.readLine());	
    	    int M = Integer.parseInt(st.nextToken());
    	    arr[i] = M%42;
        }
        for(int i = 0; i < arr.length; i++){
    	    int temp=0;
    	    for(int j = i+1; j < arr.length; j++)
    	    if(arr[i]==arr[j]) {
    	    	temp++;
        	}
    	    if(temp==0)count++;
       }
        System.out.print(count);
        br.close();
        bw.flush();
        bw.close();
    }
}