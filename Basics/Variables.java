package Basics;

public class Variables {
    public static void var(String[] args) {
        int myNumber = 88;
        short myShort = 847;
        long myLong = 9797;
        double myDouble = 7.3243;
        float myFloat = 324.3f;
        char myChar = 'y';
        boolean myBoolean = false;
        byte myByte = 127;

        System.out.println("myNumber  =======>  " + myNumber);
        System.out.println("myShort  =======>  " + myShort);
        System.out.println("myLong  =======>  " + myLong);
        System.out.println("myDouble  =======>  " + myDouble);
        System.out.println("myFloat  =======>  " + myFloat);
        System.out.println("myChar  =======>  " + myChar);
        System.out.println("myBoolean  =======>  " + myBoolean);
        System.out.println("myByte  =======>  " + myByte);
    }

    public static void main(String[] args) {
        var(args);
    }
}
