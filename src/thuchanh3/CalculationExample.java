package thuchanh3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hay nhap x:");
        int x=sc.nextInt();
        System.out.println("hay nhap y:");
        int y=sc.nextInt();
        CalculationExample calc=new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x,int y){
        try{
            int a=x+y;
            int b=x-y;
            int c=x/y;
            int d=x*y;
            System.out.println("tong x+y="+a);
            System.out.println("hieu x-y="+b);
            System.out.println("tich x/y="+c);
            System.out.println("thuong x+y="+d);
        }
        catch(Exception e){
            System.out.println("xay ra ngoai le:"+e.getMessage());
        }
    }
}
