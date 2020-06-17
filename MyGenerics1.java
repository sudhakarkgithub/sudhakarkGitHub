package project24;

import java.util.Comparator;

//Generic interface definition
interface DemoInterface<T1, T2> {
	T2 mytest(T1 t);

	T1 myOperation(T2 t);

	void tetes();
}

public class MyGenerics1 implements DemoInterface<String, Integer> {

	@Override
	public Integer mytest(String t) {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	public String myOperation(Integer t) {
		// TODO Auto-generated method stub
		return "abc";
	}

	@Override
	public void tetes() {
		// TODO Auto-generated method stub

	}

}

class HashMap<T1, T2> {
	public void put(T1 obt, T2 ob2) {

	}
}
