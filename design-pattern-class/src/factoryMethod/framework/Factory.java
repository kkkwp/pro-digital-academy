package factoryMethod.framework;

public abstract class Factory {

	// protected: 같은 클래스, 하위 클래스 및 같은 패키지 내의 클래스만 접근 가능
	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product product);

	// final: IDCardFactory에서 상속 받아도 수정은 불가능
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
}
