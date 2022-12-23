
public class Ex3_26 {
	public static void main(String[] args) {
		/*논리 연산자가 효율적인 연산을 하는지 확인하는 예제이다. 변수 b에 증감 연산자 '++'을 사용해서 우측 피연산자가 처리되면,
		 * b의 값ㄷ이 증가하도록 했다. 그러나 실행겨로가에서 알 수 있듯이. 두 번의 논리연산 후에도 b의 값은 여전히 0인 채로 남아있다.
		 * OR의 경우는 좌측 피연산자가 참이라서, 그리고 AND의 경우는 좌측 피연산자가 거짓이라서 우측 피연산자를 평가하지 않았기 때문이다.
		 */
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n",a,b);
		System.out.printf("a!=0 || ++b!=0 = %b%n",a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n",a,b);
		System.out.printf("a==0 && ++b!=0 = %b%n",a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n",a,b);
		
		
	}
}
