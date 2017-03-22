import java.util.Scanner;
public class Number7 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
int a;

	System.out.println("Vvedite chislo :");
	a = scn.nextInt();
	if (a>0 & a%2==0){
	System.out.println("Podhodit");
	}
	else if (a>0 & a%2!=0){
	System.out.println("Error");
	}
	else if (a<-0 & a%2==0){
	System.out.println("Error");
	}
	else if (a<-0 & a%2!=0){
	System.out.println("Error");
	}
	else if (a==0){
	System.out.println("Ваше число 0 ");
	}
	}
}