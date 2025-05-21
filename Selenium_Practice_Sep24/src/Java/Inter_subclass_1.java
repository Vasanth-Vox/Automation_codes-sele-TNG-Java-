package Java;

 class subclass_1 implements Inter_mainclass_01{

	

	@Override
	public void sslc() {
	System.out.println("int x");
		
	}

	@Override
	public void Hslc() {
		// TODO Auto-generated method stub
		System.out.println("int xxx");
		
	}}
	
	public class Inter_subclass_1{
	public static void main(String[] args) {
		
		subclass_1 calc = new subclass_1();
		calc.Hslc();
		calc.sslc();
		

}
}