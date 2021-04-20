public class Replace 
 {
public static void main(String args[])
 {
String S1 = new String("the girl is reading");
System.out.println("Original String is ': " + S1);
System.out.println("String after replacing 'girl' with 'boy': " + S1.replace("girl", "boy"));
System.out.println("String after replacing all 't' with 'a': " + S1.replace('t', 'a'));
 }
}