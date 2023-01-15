/**
 * This program was written simply to demonstrate all the basic Java statements
 * taught in Sololearn.com Java course and other similar beginner courses.
 * You can both read it and run it. Use it as an interactive Java cheat sheet.
 * Written in by Lukáš Tomek in IntelliJ Idea.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    //"public" - accessible by other classes, "static" - belongs to this class, only one instance exists
                                                // "void" - no return value, "String[] args" = input parameter is array of strings

        // -----BASIC VARIABLE TYPES-----
        int x = 3; //"int x" is variable DECLARATION, "= 3" is variable INITIALIZATION
        double y = 586.8;
        String z = "Gnome";
        char g = 'a';
        Boolean h = true;
        int i = (2*3 + 6/2 - --x) % 4;
        int a = 4;
        int b = 4;
        int c = 4;
        int d = 4;
        int e = 4;
        a -= x; //the same as a = a - x;
        b += x; //the same as b = b + x; etc.
        c *= x;
        d /= x;
        e %= x;

        //-----USER INPUT-----
        System.out.println("Write down your SURNAME and press Enter:");
        Scanner my_scanner = new Scanner(System.in);
        String name = my_scanner.nextLine();
        System.out.println("Write down your AGE and press Enter:");
        int age = my_scanner.nextInt();
        System.out.println("Write down your MONEY available and press Enter (in USD):");
        int money = my_scanner.nextInt();

        // -----OUTPUT-----
        System.out.println(x);
        //Incrementing and decrementing by 1. Difference: "y++" uses y first, increments after but "++y" increments first, uses y after.
        System.out.println(y++);
        System.out.println(y--);
        System.out.println(z);
        System.out.println(g);
        System.out.println(h);
        //Strings concatenation
        System.out.println("Your name is probably not: Gertruda " + name);
        System.out.println(i);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // -----CONDITIONS-----
        a = 4;
        if (a>3){
            System.out.println("Variable a is greater than 3.");
        }
        if (a<5){
            System.out.println("Variable a is less than 5.");
        }
        if (a==4){
            System.out.println("Variable a is equal to 4.");
        }
        if (a>=4){
            System.out.println("Variable a is greater or equal to 4.");
        }
        if (a<=4){
            System.out.println("Variable a is less or equal to 4.");
        }
        if (a!=4){
            System.out.println("Variable a is not equal to 4.");
        } else {
            System.out.println("Variable a is actually equal to 4.");
        }
        //Note: The if statements can be nested ad libitum (if statement within if statement)
        if (age>=18){
            System.out.println("Enter permitted. Your age is right.");
        } else if (age<18) {
            System.out.println("Sorry, you are too young.");
        } else {
            System.out.println("Weird.");
        }
        //AND logical operator
        if (age>=18 && money>1000){
            System.out.println("Enter permitted. Your age is right AND you are rich.");
        }
        //OR logical operator
        if (age>=18 || money>1000){
            System.out.println("Enter permitted. Your age is right OR you are rich.");
        }
        //SWITCH - warning: when "break" statements are missing, fall through mechanism will run all the remaining cases, even when not valid
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error!");
        }

        // -----LOOPS-----
        x = 3;

        //if the condition is true, the loop will run
        while (x>0){
            System.out.println(x);
            x--;
        }
        System.out.println("End of while loop.");

        //if the condition is true, the loop will run (variable "test" is declared and recognized only within the loop!)
        //format: for ([start with this];[condition];[increment/decrement])
        for (int test = 5; test>0; test--) {
            System.out.println(test);
        }

        //the loop will run at least once, even if the condition is not true
        x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x<0);

        // -----ARRAYS-----
        int[] my_array1 = new int[3]; //another variant: int my_array1[] = new int[3];
        my_array1[0] = 5;
        my_array1[1] = 6;
        my_array1[2] = 7;
        System.out.println(my_array1[1]); //where [1] is an index

        //array literal
        String[] my_array2 = {"A", "B", "C", "D"};
        System.out.println(my_array2.length); //array length - can be used for looping through the array
        //note: "literal" means data, that go to the variable. Examples of literals: "A",'CH',524.05f

        //for each loop
        for (String f: my_array2){ //symbol ":" is read "in" - that also helps to better understand this code
            System.out.println(f);
        }

        //multidimensional arrays (arrays in arrays)
        int[][] my_array3 = { {1,2,3} , {4,5,6} };
        System.out.println(my_array3[1][2]);
        //you can also imagine it like rows and columns
        int[][] my_array4 = {
                              {1,2,3},
                              {4,5,6},
                              {7}
                            };

        // -----OOP-----
        /* • an OBJECT has:
               • IDENTITY (two apples, look the same but each has its own identity)
               • ATTRIBUTES (attribute = current state description) (like an empty mug, a blue car) (object's variables)
               • BEHAVIOUR (its function, what it is doing, METHODS) (like the car moves, the phone rings)
           • a CLASS is like a blueprint, definition, design of an object (more objects can be created based on one class)
             (an object is an INSTANCE of a class)
         */

        //usage or CALL of a method (the method is DECLARED at the end of this file)
        sayHi();
        sayHi();

        //call of a method with PARAMETERS (=input values) and RETURN value (= output value)
        System.out.println(mySum(5,9));

        //creating an object from a class (class declaration: see end of this file)
        Dog my_dog = new Dog();
        //note: the new object is created just by "new Dog()". In variable "my_dog" is not the object but only an address pointing to the object!
        //calling its method
        my_dog.bark();

        //accessing object attributes directly (do not do this in real life, rather use getter and setter)
        Car my_ford = new Car();
        my_ford.age = 21;
        my_ford.type = "Kodiaq";
        my_ford.horn();

        //creating an object with a CONSTRUCTOR (=a method that automatically runs after creating an object)
        Food my_food = new Food();
        House my_house = new House("white");

        //demonstrating REFERENCE variables (details and class declaration - see end of this file)
        PersonaBirthday my_persona_birthday = new PersonaBirthday();
        my_persona_birthday.main();

        // -----MATH CLASS-----
        int m1 = Math.abs(-28);            //absolute value
        double m2 = Math.ceil(0.123);      //rounds UP to the nearest integer (returns double)
        double m3 = Math.floor(5.897);     //rounds DOWN to the nearest integer (returns double)
        int m4 = Math.max(10,20);          //returns higher number
        int m5 = Math.max(10,20);          //returns lower number
        double m6 = Math.pow(2,3);         //2 to the power 3 (=2*2*2)
        double m7 = Math.sqrt(4);          //square root of 4 (=2 because 2*2=4)
        double m8 = Math.sin(45);          //sine
        double m9 = Math.cos(45);          //cosine
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);
        System.out.println(m8);
        System.out.println(m9);

        /* -----STATIC VARIABLES-----
           • BELONGS TO A CLASS, not a specific instance (object)
           • shared by all objects created from a class
           • only one instance of static variable exists
           • usually written in CAPS
           • using it can save memory
         */
        System.out.println(Counter.COUNT);    //the static variable can be called without creating an object (it belongs to the class, not a specific instance)
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);    //even when 2 new objects are created, COUNT is shared and was thus incremented twice
        System.out.println(c1.COUNT);
        System.out.println(c2.COUNT);         //all these statements throw number 2, they are equivalent

         /* -----STATIC METHODS (CLASS METHODS)-----
           • can be CALLED DIRECTLY WITHOUT CREATING AN OBJECT (bypassing the system of objects)
           • use static method FOR CHANGING STATIC VARIABLE (so this one method influences all objects created from the class)
           • restrictions: static method can call only static methods, access only static variables, can not refer to "this" or "super"
           • why is the main method always static? Because JVM does not need to create an object, runs it straight from class and saves memory in this way
         */

        Counter.incrementCounter();           //calling method directly from class, no object is created
        System.out.println(Counter.COUNT);

        /* -----FINAL-----
           • final variable can not be changed
           • final method can't be overridden (?????)
           • inheritance of final class is not allowed
         */

        final double pi = 3.14;
        //pi = 5;    //this is not allowed now

        /* ----- PACKAGE ----
           • package = folder with classes
           • it helps to avoid name conflicts, control access to classes, group classes together
           • under a package there can be a subpackage
           • when a class is moved in a package, this code automatically appears at the start of that class file:
             package package_name;
           • to import class from a package, use this code at the start of the Main class:
             import package_name.Class_name;
           • to import all classes from a package:
             import package_name.*

           -----ENCAPSULATION-----
           • variables of one class are hidden from the other classes
           • how to do it: set variables as private, declare getter and setter methods (setter can validate input data first)

           -----INHERITANCE-----
           • subclass copies the code (methods and variables) of superclass
           • subclass (derived class, child class) EXTENDS superclass (base class, parent class)
           • More_specific extends Less_specific (we can read "extends" as "is a" and it makes sense, for example "Dog is an Animal")
           • it allows reusing code, we can build a new class based on an existing class
                • in the subclass, all the non-private methods and variables (=data MEMBERS, MEMBER methods) are "copied" (inherited)
                  from the superclass
                • we can also add some new code
                • we can also reference the code of superclass by using "super."
                • constructor is not inherited, but:
                     • constructor without a parameter: when creating an object from subclass,
                       the constructor of superclass will automatically run - because compiler automatically inserts constructor
                       with "super();" to subclass (though we do not see it in the code. We can also insert it manually.)
                     • constructor with parameter: we must add "super(variable);" at the beginning of the subclass's constructor,
                       and the superclass constructor will run automatically when creating an object from this subclass
        */

        Employee em = new Employee();         //This runs Employee constructor automatically
        em.name = "John Smith";
        em.age = 38;
        em.salary = 100000.00;

        Programmer pr = new Programmer();     //Programmer class is inherited from the Employee class (see end of this file)
                                              //This runs Employee and Programmer constructor
        pr.name = "Joe Holzmann";
        pr.age = 35;
        pr.salary = 200000.00;
        pr.language = "Java";                 //name,age,salary are inherited (reused code from superclass), language is added in subclass

        em.printData();
        pr.printData();

        /* continue here!
           POLYMORPHISM
           ABSTRACTION
         */






















    }

    //declaration of a method
    static void sayHi(){                      //"void" = no RETURN value
        System.out.println("Hi everyone!");
    }

    //declaration of a method with PARAMETERS and RETURN value
    static int mySum(int a, int b){           //"int" defines return type, also the 2 parameters are "int" type. "void" missing = RETURN.
        return a+b;
    }














}

/* -----CLASS DECLARATION-----
   • If it is not public, it can be here. If public, it must be in a separate file called "Dog.java".
 */
class Dog {
    void bark(){
        System.out.println("Woof woof!!");
    }
}

class Car {
    int age;   //class variables or attributes
    String type;
    void horn (){
        System.out.println("Beep.");
    }
}

/* -----ACCESS MODIFIERS-----
          • class:
            • public: accessible by other classes
            • - (=default): accessible only by classes in the same package

          • attribute, method:
            • public: accessible by other classes
            • - (=default): method/attributes accessible only by classes in the same package
            • protected: method/attributes accessible only by classes in the same package + by subclasses
            • private: accessible only within the class
         */
class Weather {
    private int temperature;     //can not be called outside the object, works only within the object (class)
    private int pressure;

    public void today() {
        System.out.println("Nice weather today!");
    }
}

/* -----GETTER AND SETTER-----
     • It would be a bad practice to tinker with class variables (attributes) from outside. Like stopping a bicycle by sticking a rod into the wheel.
     • To make it safe, we make all the attributes private (accessible only within the class/object).
     • For safe data input, we create a SETTER method.
     • For safe data output, we create a GETTER method.
     • In getter method we can do some additional useful things, like verifying the input.
    */
class Vehicle {
    private String color;

    // Getter
    public String getColor() {    //"getXxxx" and "getYyyyy" are not compulsory names, just good practice
        return color;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;    //"this." means this class/object. Without "this." we mean a variable in the current method level.
                               //If a method variable and a class variable have the same name (like here), this discerns between them.
    }
}

/* -----CONSTRUCTOR-----
  • Constructor is a method within the class, that will automatically run (be invoked), when an object is created from the class.
    It initializes the class (=sets starting variable values, sets it to its default state).
  • Name is the same as its class name.
  • No return type. (but without "void"!)
 */
class Food {
    private String color;
    Food() {
        color = "Red";
    }       //we do not use "void"! If we use "void", the method is not considered constructor!
}
class House {
    private String color;
    House(String c) {     //constructor taking a parameter
        color = c;
    }
}

/*There can be more constructors (all with the same name). When creating a new object, the right constructor will be used.
  (Depending on if we use an input parameter or not.)
*/
class Plant {
    private String color;

    Plant() {         //For creating an object like: Plant my_plant1 = new Plant();
        this.setColor("red");
    }
    Plant(String c) {       //For creating an object like: Plant my_plant2 = new Plant("brown");
        this.setColor(c);
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

/*VALUE VARIABLES vs REFERENCE VARIABLES
  • "int x = 4" - x is a variable storing VALUE, data (primitive variable).
  • "String y = "Hi"" - y is a variable storing REFERENCE (memory address) to the data, not the data itself!. The same it is with arrays.
 */
class PersonaBirthday {
    public void main() {
        Persona j;      //create variable "j"
        j = new Persona("John");    //=1) create object (by using "new"), 2) store the address of this object in reference variable "j"
        System.out.println("Address stored in j pointing to the object: " + j);
        Persona k = j;
        System.out.println("After k = j, address of object in k is the same like in j: " + j);      //k stores the same address like j
        Persona m;
        m = new Persona("Peter");
        System.out.println("New object, different address stored in m: " + m);
        j.setAge(20);
        celebrateBirthday(j);      //j is used as an input for method celebrateBirthday
        System.out.println(j.getAge());
    }

    static void celebrateBirthday(Persona p) {     //p is not an actual object, but a reference type variable storing the object's address
        System.out.println("Also p which is now the same as j stores the same address as j: " + p);
        p.setAge(p.getAge() + 1);       //p stores the same address as j, therefore the object which address is stored in j is influenced here
    }
}

class Persona {
    private String name;
    private int age;

    Persona (String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

//-----STATIC VARIABLES-----
class Counter {
    public static int COUNT=0;     //variable COUNT is STATIC: it is shared by all objects created from this class and usually written in CAPS
    Counter() {
        COUNT++;
    }

    static void incrementCounter() {
        COUNT++;
    }
}

/*-----INHERITANCE-----
  • SubClass extends SuperClass
 */

class Employee{
    String name;
    int age;
    double salary;

    Employee() {
        System.out.println("Employee class constructor runs.");
    }
    public void printData(){
        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("salary: "+ salary);
    }
}

class Programmer extends Employee{      //More_specific extends Less_specific, Programmer IS AN Employee
    String language;

    Programmer() {
        super();     //This runs superclass constructor. If the statement was not here, compiler would insert this anyway automatically.
        System.out.println("Programmer class constructor runs.");
    }

    public void printData(){
        super.printData();
        System.out.println(
                "language: "+ language );
    }
}