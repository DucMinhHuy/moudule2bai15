package thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("phuong trinh bac nhat:");
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        double a=sc.nextDouble();
        System.out.println("b:");
        double b=sc.nextDouble();
        if(a!=0){
            double solution=-b/a;
            System.out.printf("the solution is : ",solution);
        }else{
            if(b==0){
                System.out.println("the solution is all x!");
            }else{
                System.out.println("NO solution");
            }
        }
    }
}
