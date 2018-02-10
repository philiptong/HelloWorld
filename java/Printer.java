import java.util.List;

public class Printer {
	
	public static void printStringList(List<String> strList) {
		for(String str : strList) {
			System.out.println(str);
		}
	}
	

	public static void printString(String str){
		System.out.println(str);
	}

	
	public static void main(String[] arg0) {
		String str = "Hello World!!!";
		Printer.printString(str);
	}

}
