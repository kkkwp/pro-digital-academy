package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {

	private final String name;
	private final List<Entry> directory = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry entry : directory) {
			size += entry.getSize();
		}
		return size;
	}

	// 방문한 Directory의 인스턴스(this)를 Visitor에 가르쳐 준다.
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	// Directory에 포함된 Entry(File이나 Directory) 목록을 얻기 위한 Iterator<Entry>를 반환
	@Override
	public Iterator<Entry> iterator() {
		return directory.iterator();
	}
}
