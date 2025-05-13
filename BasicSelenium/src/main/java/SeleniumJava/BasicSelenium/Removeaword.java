package SeleniumJava.BasicSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeaword {

	public void fun(String str)
	{
		//String updatedstr =str.replaceAll("test", " ");
		//System.out.println(updatedstr);
	
	String arr[]=str.split(" ");	
	/*List<String> al = new ArrayList(Arrays.asList(arr));
	System.out.println(al);

		al.remove(1); // Attempting to add an element
  
	System.out.println(al);*/
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].equals("test")) {
			arr[i]="";
		}
	}
	System.out.print(Arrays.toString(arr));	
	}
	public static void main(String[] args) {
		Removeaword originalstring = new Removeaword();
		String OriginalString="This test has many steps";
		originalstring.fun(OriginalString);

	}

}
