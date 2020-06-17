package project24;

class Generic<T>  {
	// T stands for "Type"
	private T t;
	private T length;
	private T width;
	private T height;
	
	 public Generic(T length, T width, T height)
	   {
	      super();
	      this.length = length;
	      this.width = width;
	      this.height = height;
	   }

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class MyGenerics {
	
	
	public static void main(String[] args) {
		Generic<Integer> intVa = new Generic<Integer>(1,2, 5);
		intVa.set(10);
		
		intVa.get();
		
	}

}
