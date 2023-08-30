package visitor;

public class File extends Entry {

	private final String name;
	private final int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	// 방문한 File의 인스턴스(this)를 Visitor에 가르쳐 준다.
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
