import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class quadEq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the co-efficients:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==0){
        System.out.println("Invalid input");
        }
        else{
        double d,r1,r2;
        d=b*b-4*a*c;
        if(d>0)
        {
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("The real roots are r1="+r1+"and r2="+r2);
        }
        else if(d==0)
        {
        r1=-b/(2*a);
        System.out.println("The real and equal roots are r1=r2="+r1);
        }
        else
        {
        System.out.println("The roots are imaginary");
        r1=Math.sqrt(Math.abs(d))/(2*a);
        r2=-b/(2*a);
        System.out.println("The roots r1="+r2+"+i"+r1+"and r2="+r2+"-i"+r1);
}
}
}
}
