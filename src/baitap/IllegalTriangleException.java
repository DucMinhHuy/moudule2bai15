package baitap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao canh a:");
        int a=sc.nextInt();
        System.out.println("nhap vao canh b:");
        int b=sc.nextInt();
        System.out.println("nhap canh c:");
        double c=sc.nextInt();
        IllegalTriangleException m=new IllegalTriangleException();
        m.triangle(a,b);
    }
    private void triangle(int a ,int b){
        try{
           double c=Math.sqrt((a*a)+(b*b));
            System.out.println(c);
        }catch (Exception e){
            System.out.println("say ra ngoai le"+e.getMessage());
        }
    }
}
