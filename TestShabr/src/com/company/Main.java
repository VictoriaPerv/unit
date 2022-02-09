package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inch = 0;
        float cm = 0;
        System.out.println("Введите дюймы или сантиметры");
        String choice = input.nextLine();

        if (Objects.equals(choice, "дюйм")){
            cm = input.nextFloat();
            inch = getInch(cm);
            System.out.println(inch);
        } else {
            inch = input.nextFloat();
            cm = getCm(inch);
            System.out.println(cm);
        }
    }

    public static float getCm(float inch) {
        return (float) (inch * 2.54);
    }

   public static float getInch(float cm) {
        return (float) (cm / 2.54);
    }
}