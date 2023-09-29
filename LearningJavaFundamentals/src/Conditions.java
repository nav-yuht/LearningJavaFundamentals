public class Conditions {
    public static void main(String[] args) {
        int i = 4;
        if (i == 5) { // the if statement is to run when the condition is expected true and needed to run only once
            System.out.println("I'm not sure whether you passed or not");//== is for testing quality, something equals sth, not =. = is an asignment mark and != is when sth does not equal sth
        }
        if (i < 5) {
            System.out.println("sorry, you failed");
        }

        if (i > 5) {
            System.out.println("you passed");
        }
/////////////// else if statement

        int iScore = 6;
        if (iScore == 6) {
            System.out.println("I'm not sure whether you passed or not");
        } else if (iScore < 6) {
            System.out.println("sorry you did not pass");

        } else { //for the final option of the else if statement you don't need the condition
            System.out.println("you passed");
        }

        /////Switch statement

        switch (iScore) {
            case 0:
                System.out.println("Did you take the test?");
                System.out.println("I'm not sure what to do with you just yet.");
                break;
            case 100:
                System.out.println("You get the score marks!");
                System.out.println("Thank you and good bye.");
                break;
            case 20:
                System.out.println("it is alright to fail. Don't give up and try again.");
                break;
            default:
                System.out.println("Nothing to report.");
        }

    }
}
