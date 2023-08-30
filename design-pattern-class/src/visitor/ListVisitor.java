package visitor;

/**
 * Visitor의 하위 클래스 - File이나 Directory의 목록을 표시
 *
 */
public class ListVisitor extends Visitor {

	// 현재 주목하는 디렉터리 이름
	private String currentdir = "";

	// File 클래스의 인스턴스에 해야 할 처리
	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	// Directory 클래스의 인스턴스에 해야 할 처리
	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		for (Entry entry : directory) {
			// visit은 accept를 호출하고, accept는 visit을 호출 -> 서로 상대방을 호출: 더블 디스패치
			entry.accept(this);
		}
		currentdir = savedir;
	}
}
