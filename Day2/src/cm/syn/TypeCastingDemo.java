package cm.syn;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; // 4 bytes
		byte a= 12; //1 byte
		a=(byte) i; // Narrowing(shortening) Explicit type casting
		
		i=a;// widening (Implicit Type casting)
	}

}
