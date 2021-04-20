public class Remove
 {
public static void main(String a[])
 {
String str1="Remove White Spaces";
str1 = str1.replaceAll("\\s+","");
System.out.println("String after removing all the white spaces:"+str1);
 }
}