// # Three number comparing
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

   Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a= sc.nextInt();

        /*System.out.print("Enter second number: ");
        int b= sc.nextInt();

        System.out.print("Enter third number: ");
        int c= sc.nextInt();

       if (a>b && a>c) {
           System.out.print("First number is greater");

       }
       else if (b>a && b>c) {
           System.out.print( "Second number is  greater");


       }

       else {
            System.out.print("Third number is greater");

        } */

    String result= a>=33? "PASS" : "FAIL";
        System.out.print(result);

    }
}