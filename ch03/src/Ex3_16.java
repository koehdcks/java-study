
public class Ex3_16 {
	public static void main(String[] args) {
		/* int 형 간의 나눗셈'int/int'를 수행하면 결과가 float나 double이 아닌 int임에 주의하라/
		 * 그리고 나눗셈의 결과를 반올림을 하는 것이 아니라 버린다는 점도 꼭 기억하자. 예를 들어
		 * '3/2'의 결과는 1.5 또는 2가 아니라 1이다. 이 예제는 나눗셈 연산자의 이러한 성질을 이용해서
		 * 실수형 변수 pi의 값을 소수점 셋째자리까지만 빼내는 방법을 보여 준다.
		 */
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
	}
}
