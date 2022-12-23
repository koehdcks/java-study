
public class Ex3_5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);// 결과도 int값이기 때문에 소수점 이하는 버려진다.
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);// 둘중 한쪽을 float로 형변환해서 한쪽이 자동형변환
	}
}
