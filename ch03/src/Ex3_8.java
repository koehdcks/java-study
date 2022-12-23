
public class Ex3_8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; 
		//long c = (long)a * b;   올바른 결과를 얻으려면 변수a 또는 b의 타입을 'long'으로 형변환해야 한다.
		System.out.println(c);
		/* 식 a*b의 결과 값을 담는 변수 c의 자료형이 long타입이기 때문에 값을 저장하기에 충분하므로 '2000000000000'이 출력될 것 같지만,
		 * 결과는 전혀 다른 값이 출력된다. 그 이유는 int타입과 int타입의 연산결과는 int타입이기 때문에 
		 * 이미 오버플로우가 발생한 값을 long타입의 변수에 저장을 하게 되는것 이다.
		 */
	}
}
