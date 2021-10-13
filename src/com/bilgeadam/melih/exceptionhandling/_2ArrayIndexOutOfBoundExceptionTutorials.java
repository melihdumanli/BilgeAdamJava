package com.bilgeadam.melih.exceptionhandling;

public class _2ArrayIndexOutOfBoundExceptionTutorials {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        for (int i =0; i<dizi.length; i++){
            dizi[i] =i;
        }
        //forEach
        for (int temp :dizi) {
            System.out.println(dizi[temp]);
        }
        try {
            System.out.println(dizi[5]);
        }catch (ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
        }catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("Program Devam Ediyor...");

    }
}
