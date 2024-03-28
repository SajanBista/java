/*creating calculator using java and also taking input from the user*/
import java.util.Scanner;
class Calculator{
public static void main(String args[]){
int a;
int b;
Scanner num1=new Scanner(System.in);
System.out.println("Enter  first number :");
a=num1.nextInt();
Scanner num2=new Scanner(System.in);
System.out.println("Enter second number :");
b=num2.nextInt();
System.out.println("the following is the output of calculator");
System.out.println("the addition of the given number is:" + (a+b));
System.out.println("the subtraction of the given number is:" + (a-b));
System.out.println("the division of the given number is:" + (a/b ));
System.out.println("the multipication of the given number is:"+ (a*b));
System.out.println("the reminder of the given number is:" + (a%b));
}
}
