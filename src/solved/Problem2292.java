package solved;

/*
 * 벌집 문제
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		int sum = 0;
		
		while(true) {
			if(n > sum * 6 + 1) {
				i++;
				sum += i;
			}else {
				break;
			}
		}
		
		System.out.println(i + 1);
		
		br.close();

	}// end main
	
}
