package Math;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();

        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
//        if(a==0){
//            System.out.println("gcd is " + b);
//        }
//        else{
//            System.out.println("gcd is " + a);
//        }
        int gcd  = Math.max(a,b);
        System.out.println("gcd is " + gcd);
        scan.close();


    }

}
