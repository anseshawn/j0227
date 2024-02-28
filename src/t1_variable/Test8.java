package t1_variable;

//강제 타입변환(casting)
public class Test8 {
	public static void main(String[] args) {
		double su1 = 3.14;
		int res;
		
		//res = su1;	double형식을 int형식에 넣으면 error 발생
		
		//강제 형변환
		res = (int) su1;
		System.out.println("res : " + res);
		
		short ss1 = 10, ss2;
		int ii1 = 100;
		
		//ii1 = ss1;	//자동형변환
		//ss1 = ii1;	// 에러 발생
		ss1 = (short) ii1; //강제 형변환
		System.out.println("ss1 : " + ss1);
		
		int su = 1000000;
		System.out.println("su : " + su);
		
		ss2 = (short) su;
		System.out.println("ss2 : " + ss2); /* 변수의 바이트 크기가 다르기 때문에
		(short: 2바이트)(int: 4바이트) 앞의 2바이트는 버려짐 ex) 1101 -> 01 */
	}
}
