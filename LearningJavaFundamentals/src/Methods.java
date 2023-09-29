public class Methods {
    static String myName = "Matt";

    public static void main(String[] args) { //(String[] args) is the methods signature, but some programmers call the whole line methods signature
        for (String arg : args) {
            System.out.println(arg);
        }
        int result = addTwoNumbers(7, 16); //to run one method from another method is called: calling a method
        System.out.println("The result was" + " " + result);
        double total = addThreeNumbers(2.0, 1.7, 3.2);
        System.out.println(total);
        System.out.println(myName);
        paperWork(4, 5);
    }
    NameManager nameManager = new NameManager();
    NameManager manager = new NameManager();//you can theoretically name the variable whatsoever, but practically, it should be named after the class's name
    //NameManager is a class and class is a valid datatype.
    //We're creating an instance of the class NameManager by naming a variable with the same name
    // as the class's name, but with lowercase. This is a convention in Java -- convention as an unofficial rule, or it is just common?
    //Matt explains this instantiation as creating an instance of the blueprint for a house. In order to go into the house, we need to create an instance of the house based on that blueprint
    //nameManager is a variable/ an object/ an instance of the class NameManager
    //the new key word is used to create a copy of the class.

    //Keyword public and private.
    //private means it can be accessed only within the class, where it is defined in. For exp. you cannot call it from outside of that class/method
    //public means we can access the variables, methods, properties from outside but only when instantiating the object

    public static double addThreeNumbers(double value1, double value2, double value3) {
        double result = value1 + value2 + value2;
        return result;
    //static means that we can call a method without first instantiating an object from it. We don't use it very much in practice.
        //Within the course so far, we have been writing codes with classes/methods that we haven't been able to instantiate, we've had to use the keyword "static" - what s that mean?
        //therefore it would be good just to practice without using it
        //static in English means not moving, changing or developing.
        //the adjective from modern Latin "staticus", from Greek "statikos" -‘causing to stand’, from the verb histanai
    }

    public static int whoIsOlder(int age1, int age2) {
        if (age1 > age2) {
            return age1;
        } else {
            return age2; //or you can just write "return age2;"
        }
    }

    //ternary operator - alternative and shorter way to write the if else statments.
    public static boolean longerThan5(String word) {
        //        if (word.length() >= 6) {
        //           return true;
        //        }
        //        return false;
        //        return word.length() >= 6 ? true : false; here, we ask a question, if the condition is>6, return true, else return false.
        return word.length() >= 6; // this is shorter and will do the same, because it'll return either the first or the second. If it is >6, return true, else return false.
    }

    public static int addTwoNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
        printMyName();
        if (number1 == 0) {
            return -1; // this is valid code. If the number1 is 0, run the code inside == for it to run once, then the code will be no longer executed; otherwise, run number1 + number2. This is because for the method to always return a value.
        } else {
            return number1 + number2; // or without the else {} statement.
        }
    }

    public static void printMyName() {
        System.out.println("My name is matt");
    }

    public static int paperWork(int n, int m) {
        int result = n * m;

        if (n <= 0) {
            return 0;
        }

        return result;
    }
}
