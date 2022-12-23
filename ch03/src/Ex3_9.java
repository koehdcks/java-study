
public class Ex3_9 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a); // int * int = int로 이미 오버플로우가 발생한 값을 a에 저장한값을 출력
		System.out.println("b="+b); 
	}
}
