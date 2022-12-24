
public class Exercise3_10 {
	public static void main(String[] args) {
		// ch의 값이 대문자이면 소문자로 변경하는 코드
		char ch = 'A';
		
		char lowerCase = 'A'<=ch && ch<='Z' ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
