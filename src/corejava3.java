
public class corejava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is an object that represent sequence of characters
		//String literal(same values takes single storage)
		//String s = "Hello";
		//String s1 = "Hello";
		//new memory operator(same values takes new individual storage)
		//String s2 = new String("Welcome");
		//String s3 = new String("Welcome");
		//Printing of chars sequence & reverse
		
		String s4 = "Research shows that students";
		String[] splittedString = s4.split("that");

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());

		//for(int i =s4.length()-1;i>=0;i--)

		//{
			//System.out.println(s4.charAt(i));

		//}
		

		for(int i=s4.length();i>=0;i--)
		{
		System.out.println(s4.charAt(i));
}
		
	}

}
