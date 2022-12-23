
public class Ex3_17 {
	public static void main(String[] args) {
		// 이 예제는 소수점 넷째자리에서 반올림하는 방법을 보여준다. 이전 예제와 다른 점은 반올림을 위해 0.5를 더해 준다는 것이다.
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println(shortPi);
	}
}
