import java.util.List;
import java.util.Set;

public class Printer {
	
	public static void printStringSet(Set<String> strSet) {
		for(String str : strSet) {
			System.out.println(str);
		}
	}
	
	public static void printStringArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i ++) {
			System.out.println(strArray[i]);
		}
	}
	
	public static void printStringList(List<String> strList) {
		for(String str : strList) {
			System.out.println(str);
		}
	}

	public static void printString(String str){
		System.out.println(str);
	}

}
