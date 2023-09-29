import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
      String myName = "Dale MaccDell";
      String yourName = "Dale Smith";

      String myFirstName = myName.substring(0,4);
      String yourFirstName = yourName.substring(0,4);
      System.out.println(myFirstName);
      System.out.println(yourFirstName);

      //boolean weHaveTheSameFirstName = myFirstName ==yourFirstName; / this is not going to work. You have to call the method using a boolean
      boolean weHaveTheSameFirstName = myFirstName.equals(yourFirstName);
      System.out.println(weHaveTheSameFirstName);//without this line the true or false value would not be seen on screen

      System.out.println("My firstname is " + myFirstName);
      System.out.println("Your firstname is " + yourFirstName);



      int length = myName.length();
        System.out.println("My name is " + myName);
        System.out.println("It has " + length + " characters");
        String myNameUpper = myName.toUpperCase();
        System.out.println("My name is " + myNameUpper);
      String phrase = "Many hands make light work.";
        System.out.println(phrase.startsWith("Many"));//it returns a value true
        System.out.println(phrase.startsWith("many"));//it returns a value false
        System.out.println(phrase.indexOf("Light")); //-1 means there is no such value at all
        System.out.println(phrase.indexOf("lights"));//-1 means there is no such value at all
        System.out.println(phrase.substring(14));
        System.out.println(phrase.substring(16, 21));


        String firstDay = "Saturday";
        String lastDay = "Sunday";
        if (firstDay.equals("Sunday")){
            firstDay = "Sunday";
            System.out.println(firstDay);
        }
        else {
            lastDay = "Saturday";
            System.out.println(lastDay);
        }
        // The ternary statement // check this again

        String nextDay = lastDay.equals(firstDay) ? "Tuesday" : "Wednesday";
        System.out.println(nextDay);

        //Activity

        String person = "Sandra Burnsides";
        int spacePosition = person.indexOf(" ");

        String surname = person.substring(spacePosition + 1, person.length()); // why is it plus1
        System.out.println(surname);
        boolean evenLength = surname.length() % 2 ==0; //even number = số chẵn; odd number = số lẻ // devide by 2 to find out if the length of the surname is even or odd number. Nếu thương số là 0 thì là số chẵn.
        System.out.println(evenLength);

      System.out.println(myName + " " + surname + " ");

      //String Interpolation, check www.docs.oracle.com
      String greeting = "Good morning " + surname + ", today is " + nextDay;
      String greeting1 = String.format("Good morning %s, today is %s", surname, nextDay);
      System.out.println(greeting);
      System.out.println(greeting1);
      // for splitting an array into single variable
      String colors = "blue, red, green, orange, purple";
      String []colorsArray = colors.split(", ");

      for (String color : colorsArray){
        System.out.println(color);
      }

    }
}
