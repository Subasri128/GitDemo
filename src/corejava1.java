
public class corejava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number = 1;
		String name = "selenium";
		char letter = 's';
		double dec = 99.9;
		boolean result = true; 
		
		System.out.println(number + "Value stored");
		//arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;

		int[] arr2 = {7,5,4,3,2};
		System.out.println(arr2[3]);
		
		//for loop
		for(int i=0; i<arr2.length ; i++)
		{
		System.out.println(arr2[i]);
		}
		
		for(int i=0; i<arr.length ; i++)
		{
		System.out.println(arr[i]);
		}
		
		String[] name1 ={"rece","int","Val","pre","prod"};

		for(int i=0; i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
		
		for(String a: name1)
		{
		System.out.println(a);
		}
		
		
		int[] arr3 = {3,55,56,7,78,22,2,222,33,34};
		for(int i=0;i<arr3.length;i++)
		{
		if(arr3[i] %2 == 0)
		{
		System.out.println(arr3[i]);
		break;
		}
		else
		{
		System.out.println(arr3[i] +"not divisible by 2");
		}
		}


	}

}
