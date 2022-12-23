
public class Ex3_4 {
	public static void main(String[] args) {
		/* 부호 연산자'-'는 피연산자의 부호를 반대로 변경한 겨로가를 반환한다.
		 * 피연산자가 음수면 양수, 양수면 음수가 연산의 결과가 된다. 부호연산자'+'는 하는 일이 없으며, 쓰이는 경우도 거의 없다.
		 * 부호 연산자는 boolean형과 char형을 제외한 기본형에만 사용할 수 있다.
		 */
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);
	}
}
