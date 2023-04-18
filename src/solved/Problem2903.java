package solved;

/*
 * 사각형을 반복해서 4등분했을 때 점의 개수
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2903 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = (int) Math.pow(2, n) + 1;
		int result = r * r;
		
		System.out.println(result);
		br.close();
	}// end main
	
}
