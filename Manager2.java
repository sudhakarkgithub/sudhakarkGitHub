package project8;

public class Manager2 {
	
	public static void main(String[] args) {
		
		Iface iface = new Iface() {
			@Override
			public void perform() {

				System.out.println("perfrom");
				
			}
			
			@Override
			public int count() {

				
				return 20;
			}
		};
		iface.perform();
		
		int count = iface.count();
		System.out.println("Count  = " + count);
		
	}

}
