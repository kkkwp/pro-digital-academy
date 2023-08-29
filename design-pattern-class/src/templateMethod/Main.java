package templateMethod;

public class Main {

	public static void main(String[] args) {

		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world!");

		// d1, d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로 상속한 display 메서드를 호출핳 수 있음
		// 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해짐
		d1.display();
		d2.display();
	}
}
