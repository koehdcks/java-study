
public class Ex2_2 {
	public static void main(String[] args) {
		/* 다음과 같이 변수 x,y가 있을 때 두 변수에 담긴 값을 서로 바꾸려면
		 * 변수를 하나 더 선언해서 임시 저장소로 사용하면 된다.
		 */
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x:"+ x +" y:"+ y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+ x +" y:"+ y);
	}
}
