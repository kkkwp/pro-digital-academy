package visitor;

/**
 * File이나 Directory를 방문하는 '방문자'를 나타내는 추상 클래스
 * 방문하는 곳의 데이터 구조(File, Directory)에 의존
 */
public abstract class Visitor {

	// 오버로딩!
	public abstract void visit(File file);

	public abstract void visit(Directory directory);
}
