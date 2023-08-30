package visitor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Making root entries...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));

		// 디렉토리를 표시하기 위해 각 요소에 대해 실행하는 처리를 수행하므로 Visitor에서 처리한다.
		rootdir.accept(new ListVisitor());
		System.out.println();

		System.out.println("Making user entries...");
		Directory cat = new Directory("cat");
		Directory dog = new Directory("dog");
		Directory panda = new Directory("panda");
		usrdir.add(cat);
		usrdir.add(dog);
		usrdir.add(panda);
		cat.add(new File("diary.html", 100));
		cat.add(new File("Composite.java", 200));
		dog.add(new File("memo.txt", 300));
		panda.add(new File("game.doc", 400));
		panda.add(new File("junk.mail", 500));
		rootdir.accept(new ListVisitor());
	}
}
