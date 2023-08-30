package visitor;

/**
 * Visitor 클래스의 인스턴스(방문자)를 받아들이는 인터페이스
 */
public interface Element {

	public abstract void accept(Visitor v);
}
