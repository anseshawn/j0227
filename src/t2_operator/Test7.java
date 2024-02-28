package t2_operator;

import java.util.Scanner;

//90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 60점 미만은 F
public class Test7 {
	public static void main(String[] args) {
		//이 소스에서의 sc: 클래스변수, 객체변수
		Scanner sc = new Scanner(System.in); //객체 사용시: 생성하며 선언
		
		char res;
		int score;
		
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		res = (score >=90) ? 'A' : (score >=80) ? 'B' : (score >=70) ? 'C' : (score >=60) ? 'D' : 'F';
		System.out.println("점수 "+score+"는 "+res+"학점 입니다.");
		
		sc.close();
	}
}
