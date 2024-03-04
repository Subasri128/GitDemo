import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("FB637HA");
		a.add("FC115JJ");
		a.add("DT285RY");
		a.add("DT185RY");
		a.add("DE645EM");
		a.add("AN626FS");
		System.out.println(a.get(3));
		a.remove(5);
		System.out.println(a);
		
		for(int i=0; i<a.size(); i++)
		{
		System.out.println(a.get(i));
		}
		System.out.println("####");
		for(String val:a)
		{
		System.out.println(val);
		}
	
		System.out.println(a.contains("EC533LN"));
		
		System.out.println("#####");
		
		System.out.println(a.contains("DT285RY"));
		
		//Array list(dynamic growth of array list)
		
		String[] name = {"asd", "qwe", "ert","tyu","iop"};
		List<String>nameArrayList= Arrays.asList(name);
		System.out.println(nameArrayList.contains("asd"));
		
		
		
		
	}

}
