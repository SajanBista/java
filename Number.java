/*taking the input from user and finding it is negative or positive number*/
import java.util.Scanner;
class Number{
public static void main(String args[]){
int a;
Scanner obj= new Scanner(System.in);
System.out.println("enter the number you want to know that is positive or negative.");
a= obj.nextInt();
System.out.println(a + "is the number that you entred.");
if(a >= 0)
{
System.out.println(a + "is the positive number");
}
else
{
System.out.println(a + "is the negative number");

}
}
}
