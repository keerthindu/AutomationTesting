package OopsJavaConcept;

import java.util.Arrays;

public class oopsConcept {
	
	static void cal() {
		int i =10;
		System.out.println(i++ );
		System.out.println(++i);
		
	}
	
	static void sorting() {
		
		int element[]= {23,45,69,10,47,100};
		Arrays.sort(element);
		//System.out.println("after sorting" +Arrays.toString(element));
		for(int i:element) 
		System.out.println(i);
	}
	
	public void replace() 
	{
		
		String item="Indu";
		String i=item.replace('I', 'B');
		System.out.println(i);
	}
	
	public void reversing()
	{
		String value = "Dindigul";
		StringBuilder str = new StringBuilder(value);
		System.out.println(str.reverse());
	}
	
	
	
	public static void main(String args[]) {
		//oopsConcept.sorting();
		oopsConcept obj = new oopsConcept();
		//obj.replace();
		//obj.reversing();
		oopsConcept.cal();
		
			
	}

}
