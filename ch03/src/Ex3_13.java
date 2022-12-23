
public class Ex3_13 {
	public static void main(String[] args) {
		char c1 = 'a';
		
		/*char c2 = c1 + 1;  컴파일 에러발생, 이와같이 변수가 들어가 있는 경우에는 컴파일러가
		 * 미리 계산을 할 수 없기 때문에 char c2 = (char)(c1+1);과 같이 형변환을 해주어야 한다. 
		 */
		char c2 = 'a' + 1; //리터럴 간의 연산이기 때문에 에러가 발생하지 않는다.
		
		System.out.println(c2);
	}
}
