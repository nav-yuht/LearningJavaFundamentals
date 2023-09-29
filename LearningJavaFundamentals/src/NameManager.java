//Introducing classes
public class NameManager {// a class is basically a file potentially contained of variables and methods
                        //a file  has been created, and it doesn't have a PSVM, which is not directly runable.This is called a class
                        //In order to run this method/class, we have to instantiate it or to create an instance of it [of the class]
    String myName = "Matt Blanc";
    public String getFirstName(){
       String values[] = myName.split("");
        return values[0];
    }
    // NameManager nameManager = new NameManager();//instantiation of a class. This is the structure of an instantiation.
    // the class must be called from the Main method, where we can run it, because there is PSVM
    public String getSurname(){
        String values[] = myName.split("");
        return values[values.length - 1];
    }
}

