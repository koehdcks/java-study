
public class Ex2_13 {
	public static void main(String[] args) {
		/*큰 타입에서 작은 타입으로의 변환, 예를 들어서 int타입의 값을 byte타입으로 변환하는 경우는 크기의 차이만큼 잘려나간다.
		 * 그래서 경우에 따라 '값 손실'이 발생할 수 있다.
		 */
		int  i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n",i,b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n",b,i);
		
		System.out.println("i="+Integer.toBinaryString(i));
		
		
	}
}
