
public class Ex6_10 {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과" + mm.add(3,3));
	}
}
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
}
