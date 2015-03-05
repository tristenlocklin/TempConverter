package io.tristen.tempconvert.conversions;

/**
 * Copyright tristenlocklin -- Tristen Locklin 2015.
 * File created on 3/5/15.
 */
public class FromC {

    public static float convertFromC(float celTemp){
        return (9.0F / 5.0F * celTemp) + 32;
    }
}
