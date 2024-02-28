package t2_operator;

import java.util.Scanner; //외장객체: 현재위치에 없음, import로 들여와야 함

// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오. (String 변수에 담아서 출력하시오)
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		int score;
		
		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		res = (score >= 60) ? "합격" : "불합격"; //문자열은 큰따옴표
		System.out.println("점수 "+score+"는 "+res+"입니다.");
		
		sc.close(); //sc는 사용한 후 닫아줘야 함
	}
}
