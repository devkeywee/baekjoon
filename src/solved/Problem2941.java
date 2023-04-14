package solved;

/*
 * 크로아티아 알파벳
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] croatia = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i = 0; i < croatia.length; i++) {
			input = input.replaceAll(croatia[i], "a");
		}
		
		System.out.println(input.length());
		
		br.close();
	}
	
}
