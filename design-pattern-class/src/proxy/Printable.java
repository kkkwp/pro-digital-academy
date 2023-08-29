package proxy;

public interface Printable {

	// 이름 설정
	public abstract void setPrinterName(String name);

	// 이름 취득
	public abstract String getPrinterName();

	// 문자열 표시
	public abstract void print(String string);
}
