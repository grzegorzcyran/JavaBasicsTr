package edu.sda.java.basics;

public class Convertions {
    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = 20;

        //simple convertion
        short resultShort = (short) (byteVal + shortVal); // that is more safe  as we convert to wider type (short is wider then byte)
        byte byteResult = (byte) (byteVal + shortVal);  // that is dangerous as we convert from wider to smaller type

        //loosing range
        byte one = 127;
        byte two = 10;
        //byte three = one + two; bug, it's over the limit
    }
}
