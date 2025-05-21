package Java;

public class Poly_main extends Poly_sub2 {

	/*public void Learning(Poly_sub1 act) {
		System.out.println("Print cls 1");}
public void Learning(Poly_sub2 act) {
		System.out.println("Printed value cls 2");}*/
	@Override
	public void Learning() {
		System.out.println("Print cls overrided here");
			
		}
	
	
	public static void main(String[] args) {
		//This is used when we declare a methods inside the respective class
		Poly_sub1 obj0 = new Poly_sub1();
		obj0.Learning();
		Poly_sub2 obj1 = new Poly_sub2();
		obj1.Learning(3);
		obj1.Learning();
		
		//this is used when we add extends to 1 class to another
		/*Poly_sub1 obj1 = new Poly_sub1();
		obj1.Learning();
		//Poly_sub2 obj2 = new Poly_sub2();
		obj2.Learning();
		obj2.Learning(3);*/
		
		
		//this is used when we declared method in main class
		/*Poly_main object = new Poly_main();
		Poly_sub1 cls1 = new Poly_sub1();
		object.Learning(cls1);
		Poly_sub2 cls2 = new Poly_sub2();
		object.Learning(cls2);*/
		
		//override example - just ex extending maincls with any sub class
		Poly_sub2 Oride = new Poly_main();
		Oride.Learning(5);
		Oride.Learning();
		

	}

}
