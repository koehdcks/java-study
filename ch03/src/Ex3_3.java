
public class Ex3_3 {
	public static void main(String[] args) {
		int i = 5, j = 5;
		System.out.println(i++);
		System.out.println(++j); 
		System.out.println("i = " + i + ", j = " + j);
		
		/*증감연산자를 사용하면 코드가 간결해지지만, 지나치면 코드가 복잡해서 이해하기 어려워지기도 한다.
		 * 예를 들어 x의 값이 5일 때, 아래 식이 수행된 후의 x의 값은 얼마일까?
		 * x = x++ - ++x; 생각보다 쉽게 답을 내기 어려울 것이다. 실제 프로그래밍에서는 이러한 코드를 작성할
		 * 일이 없고, 이렇게 작성하는 것은 바람직하지 않다. 하나의 식에서 증감연산자의 사용을 최소화하고,
		 * 식에 두 번 이상 포함된 변수에 증감연산자를 사용하는 것은 피해야 한다.
		 */
	}
}
