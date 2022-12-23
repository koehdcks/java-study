
public class Ex3_11 {
	public static void main(String[] args) {
		/*사칙연산의 피연산자로 숫자뿐만 아니라 문자도 가능하다. 문자는 실제로 해당 문자의 유니코드로 바뀌어 저장되므로
		 * 문자간의 사칙연산은 정수간의 연산과 동일하다. 주로 문자간의 뺄셈을 하는 경우가 대부분이며, 문자 '2'를 숫자로
		 * 변환하려면 다음과 같이 문자 '0'을 빼주면 된다. '2' - '0' -> 50 - 48 -> 2
		 * 문자 '2'의 유니코드는 50이고 문자'0'은 48이므로, 두 문자간의 뺄셈은 2를 결과로 얻는다.
		 * 유니코드 표를 보면 '0'~'9'까지의 문자가 연속적으로 배치되어 있는 것을 알 수 있다.
		 * 그렇기 때문에 해당 문자에서'0'을 빼주면 숫자로 변환되는 것이다.
		 * 'A'~'Z'와'a'~'z'역시 연속적으로 배치되어 있기 때문에, 문자 'd'에서 문자'a를 빼면 다음과 같이 처리된다.
		 * 'd' - 'a' -> 100 - 97 -> 3
		 */
		
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); // 100 - 97
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero); //50 - 48
		System.out.printf("'%c'=%d%n", a, (int)a);
		System.out.printf("'%c'=%d%n", d, (int)d);
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two, (int)two);
		
	}
}
