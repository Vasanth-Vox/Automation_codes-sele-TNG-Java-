package Java;

public class Abstract_sub1 extends Abstract_sub2 implements Inter_mainclass_01 {
	
	@Override
	public void Newtask() {
		System.out.println("DO learn new things");
	}
	@Override
	public void Duration() {
		System.out.println("new learn new things");
	}
	
	//simply calling Interface methods
	@Override
	public void sslc() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Hslc() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Abstract_sub2 call = new Abstract_sub1();
		call.Duration();
		call.Newtask();
		
		//simply calling Interface methods

	}
	
	
	//Inter_mainclass_01 ask = new Abstract_sub1();
	//ask.sslc();

}
