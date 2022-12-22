
public class Ex2_4 {
	public static void main(String[] args) {
		/* 지금까지 화면에 출력할 때 println()을 써왔는데, println()은 사용하기엔 편하지만 변수의 값을 그대로 출력하므로,
		 * 값을 변환하지 않고는 다른 형식으로 출력할 수 없다. 같은 값이라도 다른 형식으로 출력하고 싶을 때가 있다. 
		 * 예를 들면, 소수점 둘째자리까지만 출력한다던가, 정수를 16진수나 8진수로 출력한다던가, 이럴 때 pritnf()를 사용하면 된다.
		 * printf()는 '지시자(specifier)'를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력하는 기능을 가지고 있다.
		 * 정수형 변수에 저장된 값을 10진 정수로 출력할 때는 지시자 '%d'를 사용하며, 변수의 값을 지정된 형식으로 변환해서 지시자대신 넣는다.
		 */
		byte  b = 1;
		short s = 2;
		char  c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수  10, 10진수로는 8
		int hexNum = 0x10;// 16진수 10, 10진수로는 16
		int binNum = 0b10;// 2진수  10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c,(int)c);
		System.out.printf("finger=[%5d]%n",finger);
		System.out.printf("finger=[%-5d]%n",finger);
		System.out.printf("finger=[%05d]%n",finger);
		System.out.printf("big=%d%n",big);
		System.out.printf("hex=%#x%n",hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%o, %d%n",octNum,octNum); 
		System.out.printf("hexNum=%x, %d%n",hexNum,hexNum); 
		System.out.printf("binNum=%s, %d%n",Integer.toBinaryString(binNum),binNum); 
		
	}
}
