package cm.syn;

public class WrapperClassDemo {
	public static void main(String[] args) {
		WrapperClassDemo obj = new WrapperClassDemo();
		boolean isAvailable = true;
		//Boolean isReady = new Boolean(isAvailable);
		Boolean isReady = isAvailable; //AutoBoxing
		System.out.println("Primitive boolean value :"+ isAvailable);
		System.out.println("Object boolean value :"+ isReady); //Auto Unboxing
		System.out.println("obj is :"+obj);
		
		Integer integer = new Integer(25);
		Float f = new Float(56.89);
	}
}
