
public class Ex3_7 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
		/* 이 예제를 실행하면 44가 화면에 출력된다. 10 * 30의 결과는 300이지만,형변환에서 배운 것처럼, 큰 자료형에서 작은 자료형으로
		 * 변환하면 데이터의 손실이 발생하므로 값이 바뀔 수 있다. 300은 byte형의 범위를 넘기 때문에 byte형으로 변환하면 
		 * 데이터 손실이 발생하여 결국 44가 byte형 변수 c에 저장된다.
		 */
	}
}
