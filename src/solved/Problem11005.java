package solved;

/*
 * 10진법 수를 n진법 수로 변환
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(num > 0) {
			int rem = num % n;
			if(rem > 9) {
				sb.append((char)(rem - 10 + 'A'));
			}else {
				sb.append(String.valueOf(rem));
			}
			
			num /= n;
		}
		
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < sb.length(); i++) {
			sb2.append(sb.charAt(sb.length() - (i + 1)));
		}
		
		System.out.println(sb2);
		
		br.close();
	}// end main
	
}// end class
