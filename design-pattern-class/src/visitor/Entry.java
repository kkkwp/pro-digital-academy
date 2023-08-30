package visitor;

/**
 * Element 인터페이스를 구현
 * Acceptor의 인터페이스! File과 Directory의 상위 클래스가 되는 추상 클래스 -> Element의 accept 메서드는 File와 Directory에서 구현(acceptor)
 */
public abstract class Entry implements Element {

	public abstract String getName();

	public abstract int getSize();

	@Override
	public String toString() {
		return getName() + "(" + getSize() + ")";
	}
}
