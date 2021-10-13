package com.bilgeadam.melih.exceptionhandling;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

public class MelihDumanliException extends Exception implements Serializable {

    @Serial
    private static final long serialVersionUID = 8546602206964080295L;

    public MelihDumanliException(String errorMessage){
        super(errorMessage);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if (b<0 || h<0)
            throw new Exception("Breadth and height must be positive");
            else
                System.out.println(b*h);

    }
}
