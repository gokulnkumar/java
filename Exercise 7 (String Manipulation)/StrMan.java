import java.util.*;

class StrMan
{
	public static void main(String args[])
	{
		String str1 = "Hello";
		String str2 = "World";	
		String str5 = "java";
		String str6 = "JAVA";
		System.out.println("\nString 'concatenation':");
System.out.println("1: Using + operator");
		String str3 = str1 + " " + str2;
		System.out.println(str3);
System.out.println("1: Using concat method");	
		String str4 = str1.concat(str2);
		System.out.println(str4);

		System.out.println("\nString 'length' method:");
		System.out.println("\nLength of String 'Hello World': "+str3.length()); 

		System.out.println("\t\nString 'IndexOf' method:");
		System.out.println("\nINdex of character 'e' in HelloWorld:" + str4.indexOf('e'));

		System.out.println("\t\nString 'charAt' method:");
		System.out.println("\nCharacter at position 5 in HelloWorld:" + str4.charAt(5));
		
		System.out.println("\nString 'CompareTo' method:");
		System.out.println("\nComparing 'java' with 'java' itself: " + str5.compareTo("java"));
		System.out.println("\nComparing 'java' with 'JAVA' itself: " + str5.compareTo("JAVA"));
		System.out.println("\nComparing 'JAVA' with 'hello' itself: " + str6.compareTo("hello"));

		System.out.println("Compare To 'hello World': " + str3.contains("world"));
		System.out.println("Compare To 'hello World': " + str3.contains("World"));


	}

}
