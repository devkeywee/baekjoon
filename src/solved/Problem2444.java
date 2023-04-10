package solved;

/*
 * 2444번
 * 별찍기 - 7
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2444 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int t = 0;
		int x = 1;
		
		while(t >= 0) {
			for(int i = 0; i < ((2 * n) - (2 * (t + 1))) / 2; i++	) {
				sb.append(" ");
			}
			
			for(int i = 0; i < 2 * (t + 1) - 1; i++) {
				sb.append("*");
			}
			
			sb.append("\n");
			
			if(t + 1 == n) {
				x = -1;
			}
			t += x;
		}
		
		System.out.println(sb);
		
		br.close();

	}
}
