package org.example;

public class Main {
    static boolean isTurnOnLight= false;
    public static void main(String[] args) {
        turnOnOffLight();
        /* se puede hacer con while
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

         */
        for (int i = 1; i <=10 ; i++) {
            printSOS();

        }
    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight=(isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}