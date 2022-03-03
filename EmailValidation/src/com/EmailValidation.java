package com;
import java.util.regex.*;
import java.util.*;
public class EmailValidation{
private static String[] emails1;
public static boolean isValid(String email)
{
String regex = "^(.+)@(.+)$";
Pattern pattern = Pattern.compile(regex);
if (email == null)
return false;
return pattern.matcher(email).matches();
}
public static void main(String args[]){
String email = "yashi..goyalyahoo.com";
boolean result = isValid(email);
if (result == true)
System.out.println("Provided email address "+ email+ " is valid \n");
else
System.out.println("Provided email address "+ email+ " is invalid \n");

System.out.println("ENTER YOUR MAIL TO CHECK :");

try (Scanner sc = new Scanner(System.in)) {

String input = sc.nextLine();

System.out.println("The Email Address " + input + " is:" + (isValid(input) ? "valid" : "invalid"));

}
}
private static boolean EmailValidation(String value) {
	// TODO Auto-generated method stub
	return false;
}
}