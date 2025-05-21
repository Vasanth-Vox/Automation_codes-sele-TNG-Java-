package Java;

class axisb implements Inter_mainclass_01{
	@Override
	public void sslc() {
		System.out.println("int x"); 

	}

	@Override
	public void Hslc() {
		// TODO Auto-generated method stub
		System.out.println("int xxx");

	}
}



public interface Inter_subclass_2 {
	public static void main (String[] args) {
		
		
		Inter_mainclass_01 cal34 = new axisb();
		cal34.Hslc();
		cal34.sslc();

	}

}
