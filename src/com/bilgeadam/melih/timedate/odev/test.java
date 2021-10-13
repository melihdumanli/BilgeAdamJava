package com.bilgeadam.melih.timedate.odev;


import java.util.Scanner;

class test {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (b<0 || h<0)
            throw new Exception("Breadth and height must be positive");
        else
            System.out.println(b*h);
    }

}
