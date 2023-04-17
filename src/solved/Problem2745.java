package solved;

/*
 * n진법 수를 10진법 수로 변환
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String sNum = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for(int i = 0; i < sNum.length(); i++) {
			int num = 0;
			char cNum = sNum.charAt(sNum.length() - (i + 1));
			if(cNum < 'A') {
				num = cNum - '0';
			}else {
				num = cNum - 'A' + 10;
			}
			
			result += num * Math.pow(n, i);
		}
		
		System.out.println(result);
		
		br.close();
	}// end main
	
}// end class
