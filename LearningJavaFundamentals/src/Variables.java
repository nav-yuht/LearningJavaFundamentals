public class Variables {

    public static void main(String[] args) {
        int i = 1;//celé číslo/ số nguyên
        System.out.println("This is just a test" + " " + i);
        int j; // Java is a statically typed language - every variable must have a specific data type, although you do not have to define the value. it can be defined later on.
        j=2;
        System.out.println(j);
        long myVariable = 17;
        long anotherVariable= 3000000000L;//số lớn hơn hoặc nhỏ hơn 2billions
        double a = 17.3; //số
        float myFloat = 17.3F;

/*       var someOtherVariable = 171;
        someOtherVariable = 172; var is a shortcut for defining a variable instead of using int, double,...but if you try redefining the value a different type [first int, then double] it'll report an error.
        someOtherVariable = 71.5; */

        int first = 50;
        int second = 100;
        int third = first;
        first = 65;
        // first = 55; pořadí je důležité v Javě. příklad je tento řádek či řádek č.20. Switch those lines and see the result. third would have been 50, not 55.

        System.out.println("first " + first +
                         "\nsecond " + second +
                         "\nthird " + third);
        int weExpect2 = second / third;
        System.out.println("100 divided by 50 is " + weExpect2);

        double weExpectOnePointFive = (double)second / first; //to
        System.out.println("100 divided by 65 is " + weExpectOnePointFive); // when we divide an int by an int, we get a result also as an int. therefore 100/65 = 1.

        // 26 / 7 remainder 5

        int result = 26 / 7;
        System.out.println("The part is " + " " + result);

        int modulus = 26 % 7;
        System.out.println("The remainder is" + " " + modulus);

        boolean iAmYoungerThan30 = false;

        char myFirstNameStartsWith = 'M'; //always contains only one character, whether it is a number, a symbol or a letter.

        int [] myArray = {1,2,3,4,5};
        System.out.println("the first number is" + myArray[0]); // all arrays in Java are zero based. It means first character starts in position 0

        myArray [3] = 17; //arrays in Java are inflexible. Once the datatype and the size are defined, it cannot be changed. You can change the value of the
        System.out.println("the next is" + myArray[3]);
        System.out.println("the next is" + myArray[5]);
        //Java is a statically typed language - every variable must have a specific defined data type
        //arrays in Java are inflexible. Once the datatype and the size are defined, it cannot be changed. You can change the value of the
        //primitive data types for storing number integers [int], decimal numbers [double], Booleans [boolean] and characters [char]
        //float and short are rarely used. Only in the environments with limited memory
        //position/pořadí matters in Java - my private note, needs consultation.--Check variable scope
    }
}
