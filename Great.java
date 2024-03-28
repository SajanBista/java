//wap to find greatest among 3 numbers.
import java.util.Scanner;
class Great{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
System.out.println("enter the first number:");
double num1= input.nextDouble();
System.out.println("enter the first number:");
double num2= input.nextDouble();
System.out.println("enter the first number:");
double num3= input.nextDouble();
if(num1>num2 && num2>num3)
{
System.out.println(" the greatest number among 3 is :" +num1);
}
else if(num2>num1 && num1>num3)
{
System.out.println(" the greatest number among 3 is :" +num2);
}
else{
System.out.println(" the greatest number among 3 is :" +num3);
}
}
}
