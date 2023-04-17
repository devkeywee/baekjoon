package solved;

/*
 * 거스름돈 동전 개수 계산
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			
			int p = c / 25;
			c %= 25;
			int d = c / 10;
			c %= 10;
			int n = c / 5;
			c %= 5;
			
			sb.append(p).append(" ").append(d).append(" ").append(n).append(" ").append(c).append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}// end main
	
}// end class
