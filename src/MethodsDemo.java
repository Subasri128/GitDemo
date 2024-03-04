
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getData();
		getDataA();
		
		

	}

	
	public String getData()
	{
		System.out.println("world");
		return "Hello";
	}
	
	public static String getDataA()
	{
		System.out.println("alphabet");
		return "Hello";
	}
	
	
	
	
	
	
	
	
	
}
