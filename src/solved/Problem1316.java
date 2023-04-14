package solved;

/*
 * group word
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;
		
		while(n > 0) {
			String str = br.readLine();
			
			for(int i = 0; i < str.length() - 1; i++) {
				if(str.charAt(i) != str.charAt(i + 1)) {
					for(int j = i + 2; j < str.length(); j++) {
						if(str.charAt(i) == str.charAt(j)) {
							cnt--;
							i = str.length();
							break;
						}
					}
				}
			}
			
			--n;
		}
		
		System.out.println(cnt);
		
		br.close();
	}// end main
	
}// end class
