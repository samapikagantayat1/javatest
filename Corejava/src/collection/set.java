package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet<String> gadetstore=new HashSet<String>();
	LinkedHashSet<String> gadetmarket=new LinkedHashSet<String>();
	TreeSet<String> gadetcart=new TreeSet<String>();
	
	for(String gadget:Arrays.asList("smartphone","tablet","smartwatch"))
	{
		gadetstore.add(gadget);
		gadetmarket.add(gadget);
		gadetcart.add(gadget);
		
	}
	
	System.out.println("order in hashset"+ gadetstore );
	System.out.println("order in gadetmarket"+ gadetmarket );
	System.out.println("order in gadetcart"+ gadetmarket );
	System.out.println("gadget contains smartwatch: "+ gadetcart.contains("smartwatch"));
	System.out.println("gadget contains smartwatch: "+ gadetcart.contains("tablet"));
	System.out.println("gadget contains smartwatch: "+ gadetcart.contains("fitbit"));
	
	
	

	}

}
