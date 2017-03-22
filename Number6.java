import java.util.Scanner;
public class Number6 {
    public static void main(String[] args){
        System.out.println("Vvedite celoe chislo");
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            if(scn.nextInt()%2==0){
                System.out.println("Chislo chetnoe!");
            }
            else System.out.println("Chislo ne chetnoe!");
        }
        else System.out.println("Error");
    }
}