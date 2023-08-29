package proxy;

public class PrinterProxy implements Printable {

	private String name; // 이름
	private Printer real; // 본인

	public PrinterProxy() {
		this.name = "No name";
		this.real = null;
	}

	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			// 본인에게도 설정
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	// 본인 생성
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
