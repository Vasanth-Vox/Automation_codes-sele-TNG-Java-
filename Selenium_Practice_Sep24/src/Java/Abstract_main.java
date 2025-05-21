package Java;

 abstract class Abstract_main2 {
	public abstract void india();
}	
	 class nextclass extends Abstract_main2{
		public void india() {
			System.out.println("India should win in ICC");
		}
	
	 }

	public class Abstract_main {
	public static void main(String[] args) {
	
		nextclass cal2 = new nextclass();
		cal2.india();
		

	}

}
