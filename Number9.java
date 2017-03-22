import java.util.Scanner;
public class Number9 {
public static void main(String[] args)throws java.io.IOException{
System.out.println("Summa");
Scanner in=new Scanner(System.in);
int N=100;
int sum=0;
int b=1;
for(int i=1; i<=N; i++){
sum=sum+i;
}
System.out.println(sum);
}
}