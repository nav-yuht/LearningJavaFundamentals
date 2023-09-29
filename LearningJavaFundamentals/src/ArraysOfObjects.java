public class ArraysOfObjects {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        Books[] books = new Books [10];
        books [4] = new Books("A good read", "Matt Green", 19.99);

        Books myBook;
        myBook = new Books("A good read part 2", "Matt Green", 39.99);
        //myBook = null;
        if (myBook != null){
            System.out.println(myBook.getTitle());
       }

        books [5] = myBook;

        books [8] = new Books("Barbara", "J.F.Jacobsen", 2.9);
        books [7] = new Books(" Pride and Prejudice", "Jane Austen", 3.9);

// for loop to loop through an array/s
        for (int i= 0; i<10; i++){
            if (books[i] != null)
                System.out.println(books[i].getTitle());
        }
// an alternative for loop for each of the variable in the arrays

        for (Books book : books){
            if (books != null) {//when you have a if statement and the sta. is true, you don't need to have the curly brackets, but some programmers always use for the code is slightly easier to read
                System.out.println(book.getTitle());
            }
        }
    }
}
