package project24;

class GenericsClass {
	private Object t;

	public void set(Object t) {
		this.t = t;
	}

	public Object get() {
		return t;
	}

}

public class GenericsDemo {

	public static void main(String[] args) {

		GenericsClass class1 = new GenericsClass();
		class1.set("abr");
		class1.set(121);
	}
}
