public class Loops {
    public static void main(String[] args) {
       for(int i = 1; i <= 10; i++){
           System.out.println(i * 3);
           //1<=10 is a boolean i++ == i = i+1
       }

       double [] array = {11.1, 12.1, 13.1};
       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
        }

       int counter = 0;
       while(counter < 5 ){
           System.out.println("hello " + counter);
           counter++;//without the increment the code would run forever. Try and see.Ctrl+F2 to stop the code
       }

       int totalScoreOriginal = 101;
        while (totalScoreOriginal < 100){
            System.out.println("Hi" + totalScoreOriginal);
            totalScoreOriginal++;
        } //the code will not run, because the condition is false. 101 is not smaller than 100,
        // but if we change the loop to the do while loop, the code will run at least once = the world "Hello being printed" at least once
        // see the following

       int totalScore = 101;
       do {
           System.out.println("Hello " + totalScore);
           totalScore++;
       } while (totalScore <= 100);
    }
}
