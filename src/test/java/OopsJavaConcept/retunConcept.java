package OopsJavaConcept;

public class retunConcept {

	public static void main(String[] args) {
		//print();
		int sum =add(2,3);
		//System.out.println(sum);
		String value = cap("indu");
		//System.out.println( value);
		int[] d=data(12,34,58);
		for(int i : d) {
			//System.out.println(i);
		}
		
		System.out.println(special("I{ndu$"));

	}
	
	public static void print() {
		System.out.println("hello");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String cap(String str) {
		return str.toUpperCase();
	}
	
	public static int[] data(int a, int b, int c) {
		int[] arr= new int[]{a,b,c};
		
		return arr;
		
	}
	
	public static String special(String s) {
		s =s.replaceAll("[,.;!?(){}$\\\\[\\\\]<>%]", "");
		return s;
		
	}

}
