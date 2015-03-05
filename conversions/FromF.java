package io.tristen.tempconvert.conversions;

/**
 * Copyright tristenlocklin -- Tristen Locklin 2015.
 * File created on 3/5/15.
 */
public class FromF {

    public static float convertFromF(float fahTemp){
        return 5.0F / 9.0F * (fahTemp - 32);
    }
}
