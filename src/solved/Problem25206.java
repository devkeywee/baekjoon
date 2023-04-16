package solved;

/*
 * 학점 계산
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float allSum = 0f;
		float pointSum = 0f;
		
		for(int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subName = st.nextToken();
			float point = Float.parseFloat(st.nextToken());
			String grade = st.nextToken();
			float gradePoint = 0f;
			
			switch(grade) {
			case "A+":
				gradePoint = 4.5f;
				break;
			case "A0":
				gradePoint = 4.0f;
				break;
			case "B+":
				gradePoint = 3.5f;
				break;
			case "B0":
				gradePoint = 3.0f;
				break;
			case "C+":
				gradePoint = 2.5f;
				break;
			case "C0":
				gradePoint = 2.0f;
				break;
			case "D+":
				gradePoint = 1.5f;
				break;
			case "D0":
				gradePoint = 1.0f;
				break;
			case "F":
				gradePoint = 0.0f;
				break;
			case "P":
				point = 0f;
				gradePoint = 0f;
				break;
			}
			
			allSum += point * gradePoint;
			pointSum += point;
		}
		
		float result = allSum / pointSum;
		System.out.println(result);
		
		br.close();
	}// end main
	
}// end class
