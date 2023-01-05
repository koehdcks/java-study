class Data3 { int x; }

public class Ex6_8 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		// 같은 클래스에 있는 메서드는 참조변수없이 호출가능
		Data3 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
	}
	// static메서드는 객체 생성없이 호출가능 
	static Data3 copy(Data3 d) { //참조형 반환타입은 객체의 주소를 반환한다.
		Data3 tmp = new Data3(); //새로운 객체 tmp를 생성한다.
		
		tmp.x = d.x;  // d.x의 값을 tmp.x에 복사한다
		
		return tmp; // 객체 tmp를 반환한다.
	}
}
