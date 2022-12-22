
public class Ex2_12 {
	public static void main(String[] args) {
		/*형변환이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것이다.
		 * 형변환 방법은 아주 간단하다. 형변환하고자 하는 변수나 리터럴의 앞에 변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		 *  (타입)피연산
		 */
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score="+score);
		System.out.println("d="+d);
	}
}
