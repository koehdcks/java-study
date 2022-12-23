
public class Ex3_2 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++; //후위형으로 먼저 값이 참조된 후 i값이 증가
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
		
		i = 5;
		j = 0;
		
		j = ++i; //전위형으로 먼저 값이 증가된 후 참조
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
	}
}
