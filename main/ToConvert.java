package io.tristen.tempconvert.main;

import io.tristen.tempconvert.conversions.FromC;
import io.tristen.tempconvert.conversions.FromF;
import io.tristen.tempconvert.libs.Print;

import java.util.Scanner;

/**
 * Copyright tristenlocklin -- Tristen Locklin 2015.
 * File created on 3/5/15.
 */
public class ToConvert {

    public static float FahTempUnConvert, CelTempUnConvert;

    public static void main(String[] args){

        Scanner user = new Scanner(System.in);

        Print.p("Would you like to convert from (1)F or (2)C?");
        int useSelction0 = user.nextInt();

        Print.p("Would you like to create a temperature table? (1)Yes (2)No.");
        int useSelection1 = user.nextInt();

        if (useSelection1 == 1 && useSelction0 == 1){
            Print.p("Starting temp in F?");
            float startingTemp = user.nextFloat();
            Print.p("Temp increment");
            float tempIncrement = user.nextFloat();
            Print.p("Temp upper bound");
            float endingTemp = user.nextFloat();

            for (float temp = startingTemp; temp <= endingTemp; temp = temp + tempIncrement){
                float FahTempConverted = FromF.convertFromF(temp);
                System.out.printf("%5.2fF = %7.2fC\n", temp, FahTempConverted);
            }
        }else if(useSelection1 == 1 && useSelction0 == 2){
            Print.p("Starting temp in C?");
            float startingTemp = user.nextFloat();
            Print.p("Temp increment");
            float tempIncrement = user.nextFloat();
            Print.p("Temp upper bound");
            float endingTemp = user.nextFloat();



            for (float temp = startingTemp; temp <= endingTemp; temp = temp + tempIncrement){
                float CelTempConverted = FromC.convertFromC(temp);
                System.out.printf("%5.2fC = %7.2fF\n", temp, CelTempConverted);
            }

        }else{
            if (useSelction0 == 1){
                Print.p("What is the temp in F?");
                FahTempUnConvert = user.nextFloat();

                float CelTempConverted = FromF.convertFromF(FahTempUnConvert);
                Print.p("The temp is " + CelTempConverted + "C");

            }else{
                Print.p("What is the temp in C?");
                CelTempUnConvert = user.nextFloat();

                float FahTempConverted = FromC.convertFromC(CelTempUnConvert);
                Print.p("The temp is " + FahTempConverted + "F");
            }

        }
    }
}
