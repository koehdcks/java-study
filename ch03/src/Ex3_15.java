
public class Ex3_15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32); // 문자 'a'의 코드값에서 32를 빼면 문자 'A'의 코드값이 나오고 형변환 후 저장
		System.out.println(upperCase); 
	}
}
