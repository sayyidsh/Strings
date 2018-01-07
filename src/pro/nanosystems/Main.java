package pro.nanosystems;

public class Main {

    public static void main(String[] args) {
        // Primitive types ----> this data type built in java language.
        // byte
        // short
        // int
        //long
        // float
        // double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + "\u00A9 2018.";
        System.out.println(myString);
        String numberString = "55.36";
        numberString = numberString + "488.3";
        System.out.println(numberString);
        String newString = "10";
        int myInt = 20;
        newString = newString + myInt;
        System.out.println(newString);
        double myDouble = 99.10;
        newString = newString + myDouble;
        System.out.println(newString);
    }
}
