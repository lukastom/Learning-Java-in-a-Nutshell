/* Java program to demonstrate upcasting */
import java.io.*;
import java.util.*;

//Creating a parent class Sport
class Sport{
    //Method to display name
    void displayName(){
        System.out.println("Sport");
    }
}

//Creating a child class Cricket
class Cricket extends Sport{
    //Method to display name
    void displayName(){
        System.out.println("Cricket");
    }
}

//Creating a child class Football
class Football extends Sport{
    //Method to display name
    void displayName(){
        System.out.println("Football");
    }
}

public class Pokusy {
    public static void main (String[] args) {
        //Upcasting
        Cricket sport1 = new Cricket();
        //calling method
        sport1.displayName();

        //Upcasting
        Football sport2 = new Football();
        //calling method
        sport2.displayName();
    }
}
