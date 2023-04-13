package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		while(m > 0) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st2.nextToken()) - 1;
			int end = Integer.parseInt(st2.nextToken()) - 1;
			int mid = Integer.parseInt(st2.nextToken()) - 1;
			int diff = mid - begin;
			
			int[] tmp = new int[diff];
			for(int i = 0; i < diff; i++) {
				tmp[i] = arr[begin + i];
			}
			
			for(int i = 0; i < end - mid + 1; i++) {
				arr[begin + i] = arr[mid + i];
			}
			
			for(int i = 0; i < diff; i++) {
				arr[(begin + end - mid + 1) + i] = tmp[i];
			}
			
			--m;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		br.close();
	}
	
}
