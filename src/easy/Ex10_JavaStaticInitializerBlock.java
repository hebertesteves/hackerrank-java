package easy;

import java.util.Scanner;

public class Ex10_JavaStaticInitializerBlock {
    public static Scanner sc=new Scanner(System.in);
    public static int B;
    public static int H;
    public static boolean flag;

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
