public class stringmanipulation {
public static void main(String args[]) {
String greeting = "Hello";
System.out.println(greeting);
String txt2 = "ABCDEFGHIJKLMNOPQRXYZ";
System.out.println("The length of the txt string is: " + txt2.length());
String txt = "Hello World";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
String txt1 =  "Please locate where 'locate' occurs!";
System.out.println(txt1.indexOf("locate"));
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
System.out.println(firstName + " " + lastName);
String x = "10";
String y = "20";
String z = x + y;
System.out.println(z);
String a = "RockStar";
System.out.println(a.charAt(5));
System.out.println(a.compareTo("rockstar"));
System.out.println(a.compareToIgnoreCase("ROCKSTAR"));
}
}
	