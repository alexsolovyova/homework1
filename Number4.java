import java.util.Scanner;
public class Number4 {

public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int firstNumber=0, secondNumber=0;
int sum;

System.out.println("Enter First Number: ");
firstNumber = input.nextInt();
System.out.println("Enter Second Number: ");
secondNumber = input.nextInt();

sum = firstNumber + secondNumber;

System.out.println("The sum of the two numbers is = " + sum);
}
}