/**
 * This program was written simply to demonstrate all the basic Java statements
 * taught in Sololearn.com Java course and other similar beginner courses.
 * You can both read it and run it. Use it as an interactive Java cheat sheet.
 * Written in by Lukáš Tomek in IntelliJ Idea.
 */

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    //"public" - accessible by other classes, "static" - belongs to this class, only one instance exists
                                                // "void" - no return value, "String[] args" = input parameter is array of strings

        // ----- BASIC VARIABLE TYPES -----
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

        //----- USER INPUT -----
        System.out.println("Write down your SURNAME and press Enter:");
        Scanner my_scanner = new Scanner(System.in);
        String name = my_scanner.nextLine();
        System.out.println("Write down your AGE and press Enter:");
        int age = my_scanner.nextInt();
        System.out.println("Write down your MONEY available and press Enter (in USD):");
        int money = my_scanner.nextInt();

        // ----- OUTPUT -----
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

        // ----- CONDITIONS -----
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

        // ----- LOOPS -----
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

        // ----- ARRAYS -----
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

        // ----- OOP -----
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

        // ----- MATH CLASS -----
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

        /* ----- STATIC VARIABLES -----
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

         /* ----- STATIC METHODS (CLASS METHODS) -----
           • can be CALLED DIRECTLY WITHOUT CREATING AN OBJECT (bypassing the system of objects)
           • use static method also FOR CHANGING STATIC VARIABLE (so this one method influences all objects created from the class)
           • restrictions: static method can call only static methods, access only static variables, can not refer to "this" or "super"
           • why is the main method always static? Because JVM does not need to create an object, runs it straight from class and saves memory in this way
         */

        Counter.incrementCounter();           //calling method directly from class, no object is created
        System.out.println(Counter.COUNT);

        /* ----- FINAL -----
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

           ----- ENCAPSULATION -----
           • variables of one class are hidden from the other classes
           • how to do it: set variables as private, declare getter and setter methods (setter can validate input data first)

           ----- INHERITANCE -----
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

        /* ----- POLYMORPHISM -----
        • poly=many, morphism=forms
        • e.g.: a man is a father,employee,husband (one man with multiple functions, different behaviour in different situations)
        • one method (the same name), multiple implementations (different behaviour based on how it is called)
        • here: one method makeSound(), 3 various implementations (1 in superclass and 2 in subclasses)
          • the methods in subclasses OVERRIDE the method in superclass
        */

        Animal animal = new Animal();
        Animal animal_bee = new Bee();    //disadvantage of creating the variable from superclass (=UPCASTING): we can access
                                          //only the overridden methods, not the new (added) subclass methods!
        Bear bear = new Bear();

        animal.makeSound();
        animal_bee.makeSound();
        bear.makeSound();

        //If we want to access not only the overridden methods but also the added methods, we have to create the variable from the subclass:
        Bee bee = new Bee();
        bee.collectHoney();

        //OVERLOADING (methods with the same name differing in parameters (type, number or both) (=COMPILE-TIME POLYMORPHISM)
        System.out.println(max_number(8, 17));
        System.out.println(max_number(3.14, 7.68));

        // ----- ABSTRACT CLASS, ABSTRACT METHOD -----

        Order fedEx_order = new FedEx();    //"Order" is the abstract class
        //"FedEx fedex_order = new FedEx();" would work too
        fedEx_order.sendOrder();

        /*
          ----- INTERFACE -----
        */
        LowIncome poor_client = new LowIncome();
        poor_client.offerProduct();

        /*
          ----- TYPE CASTING -----
          • = Assigning a value of one type to a variable of another type (data type conversion)
        */

        int outcome = (int) 3.14;   //floating point to int
        System.out.println(outcome);

        int outcome2 = (int) 'j';   //char to integer
        System.out.println(outcome2);

        /* ----- CLASS UPCASTING -----
           • result: only superclass methods (and overridden methods) are accessible from object created from the subclass
           • use: it allows creating arrays or collections (Lists, Maps, Sets, etc.) of the parent type where child objects are stored.
         */
        Animal my_animal = new Bee();     //object created from subclass is casted to variable of superclass type

        /* ----- CLASS DOWNCASTING -----
          • When you downcast, you're basically saying, hey I know this particular Animal is actually a Dog, because
            it's barking (can be checked with "instanceof"). Therefore, I want to call a method that's dog-specific, like Bark().
            If you try to downcast an Animal into a Dog, but it's not *actually* a Dog, your program will crash.
          • Class downcasting is just bad design most of the time. It is used rarely. Some right uses:
            • with connection to equals method of Object
            • when using a framework (like coding for Android), where we want to access the subclass methods from a superclass
          • The result is: even if it is superclass type, we can call the subclass overridden methods this way
         */
        //Bee my_bee = new Animal();     //This is not allowed! We can not say "animal IS A bee"
        Bee my_bee = (Bee) my_animal;
        my_bee.collectHoney();
        //shorter form:
        ((Bee) my_animal).collectHoney();

        /* ----- ANONYMOUS INNER CLASS, ANNOTATIONS -----
           • = inner class without name, that overrides (modify) a method in an object
             • the override (modification) is applicable only to the current object
           • we can use @Override ANNOTATION, so the code is clear
             • Annotations do not change the action of a compiled program.
             • Annotations are not just comments ignored by the compiler. Compiler reads them.
             • annotations are like metadata for methods, classes, variables etc.
             • if we use @Override annotation, but the code is actually not an override, the program will not compile.
               So, by using @Override annotation, we tell the compiler, that our intention was to override.
         */
        Bee my_cute_bee = new Bee() {
            @Override public void collectHoney() {
                System.out.println("Oh man, the bee collects honey, whoooo yeaaaaah. Overriding!");
            }
        };
        my_cute_bee.collectHoney();

        // ----- NESTED INNER CLASS ----- (see the class at end of this file)
        Outer obj = new Outer();     //this runs the constructor, which runs the inner class

        /* ----- .EQUALS() ------
          • "==" - operator - compares reference (IDENTITY)
          • "equals()" - method - compares contents (EQUIVALENCY)
         */
        String a_name = "John";
        String b_name = "John";

        System.out.println(a_name==b_name);
        System.out.println(a_name.equals(b_name));

        A obj_a = new A();
        obj_a.sayHi();

        A obj_b = new A();
        obj_b.sayHi();

        System.out.println(obj_a==obj_b);   //This is false, because the 2 variables reference 2 different objects.
                                            //References (memory addresses) are compared here.
                                            //It's like a question: do they both reference the same object?

        A obj_c = obj_a;
        System.out.println(obj_c==obj_a);   //This is true, because both variables reference the same object.
                                            // References (memory addresses) are compared here.

        System.out.println(obj_c.equals(obj_a));    //This is true, because both variables reference the same object
                                                    //Reason: default Java .equals():
                                                    //1) compares object CONTENTS && 2) both variables must reference the same object

        System.out.println("Thanks to our .equals() override, this is now true:");
        System.out.println(obj_a.equals(obj_b));      /* Without our own equals() override THIS IS FALSE!!
                                                         • Reason: default Java equals() implementation
                                                           returns true if the objects' CONTENTS is the same
                                                           AND ONLY if the 2 variables are non-null and both
                                                           point to the *same reference* (if x==y also returns true)!

          • If we want to compare 2 objects having different IDENTITY (different reference) but the same CONTENTS, we must create
            our own equals() override.
          • In order to other things work lately, we must also create hashCode() override.
          • Also: default .equals() is specific, our overridden .equals() will be more general.
          • How in Intellij Idea: place the cursor on the right place in code (in the class upon which we want to call equals() method),
            in menu choose Code>Generate>equals() and hashCode()
          • Advantage: when generating the equals() override, we can customize it (e.g. choose what fields (attributes, variables) to compare
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

    //OVERLOADING (methods with the same name differing in parameters (type, number or both) (=COMPILE-TIME POLYMORPHISM)
    static double max_number(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max_number(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }






















}

/* ----- CLASS DECLARATION -----
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

/* ----- ACCESS MODIFIERS -----
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

/* ----- GETTER AND SETTER -----
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

/* ----- CONSTRUCTOR -----
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

//----- STATIC VARIABLES -----
class Counter {
    public static int COUNT=0;     //variable COUNT is STATIC: it is shared by all objects created from this class and usually written in CAPS
    Counter() {
        COUNT++;
    }

    static void incrementCounter() {
        COUNT++;
    }
}

/*----- INHERITANCE -----
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
        System.out.println("language: "+ language );
    }
}

/*----- POLYMORPHISM -----
  • one method (the same name), multiple implementations (different behaviour based on how it is called)
  • here: one method makeSound(), 3 various implementations (1 in superclass and 2 in subclasses)
    • the methods in subclasses OVERRIDE the method in superclass

  ----- METHOD OVERRIDING -----
  • method in subclass overrides method in superclass with the same name
    (=there is a specific implementation of this method in the subclass)
  • =RUNTIME POLYMORPHISM
  • constructors can not be overridden
  • final or static methods can not be overridden
 */

class Animal {
    public void makeSound() {
        System.out.println("Animal says: Grr grr");
    }
}
class Bee extends Animal {
    public void makeSound() {
        System.out.println("Bee says: Buzz buzz");
    }
    public void collectHoney() {
        System.out.println("Bee collects honey.");
    }
}
class Bear extends Animal {
    public void makeSound() {
        System.out.println("Bear says: Growl growl");
    }
}

/*
  ----- ABSTRACT CLASS -----
  • abstract class is an abstraction of subclasses - we make subclass from it, and only from this subclass we can create object
   (it is not possible to create object from an abstract class)
  • in abstract class there can be ABSTRACT METHODS = declared methods without implementation (without any code)
  • it serves as an abstraction of subclasses and a basic model, after which the subclasses are made (=default implementation, common definition)
   • subclasses have to implement the abstract classes (similar to overriding) (otherwise they must be also abstract)
  • if a developer has a structure already in mind, he can write an abstract class, even if implementation details
   are not known yet
  • abstraction shows, how classes/object will be USEd, look like, not how they will WORK
   • (Example: everyone at home uses a sink+tap to get water - they know its function but not its exact inner workings)
  • can have constructor
*/

abstract class Order {
    int order_id = 0;
    abstract void sendOrder();
}
class FedEx extends Order {
    public void sendOrder() {
        System.out.println("Sending the order by Fedex.");
    }
}

/* ----- INTERFACE -----
  • interface = abstract class with only abstract methods (methods are implicitly abstract and public) (=total abstraction)
  • Interfaces specify what a class must do and not how. It is the blueprint of the class behaviour.
  • variables will be implicitly public static final
  • no constructor allowed
  • when you implement an interface, you have to override all of its methods
  • a class can implement multiple interfaces!
  • how to extend + implement multiple:
    public class Dog extends Animal implements Swimmer, Player {
 */

interface Client {
    void offerProduct();
    void greet();
}
class LowIncome implements Client {
    public void offerProduct() {
        System.out.println("You can borrow money!");
    }
    public void greet() {
        System.out.println("Hi.");
    }
}

/* ----- NESTED INNER CLASS -----
 • = a class in a class
 • Usage: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together.
 • Ex.: Car class. A subclass would be a specific *type* of car - Mercedes, Ford, etc.
   An inner class would be a specific *part* of a car, such as an engine, tire, etc.
 • The nested class can access all the member variables and methods of its outer class.
   • If we declare an inner class private, it cannot be accessed from an object outside the class.
 */
class Outer {
    Outer(){
        Inner obj = new Inner();
        obj.print();
    }
    private class Inner {      //class in class = nested inner class
        public void print() {
            System.out.println("In a nested class method");
        }
    }
}

/* ----- OVERRIDING .equals() and .hashCode() so we can compare an object with the object created from this class
   • the overridden methods were generated by IDE
 */
class A {
    int x = 1;
    public void sayHi (){
        System.out.println("Hi, " + x + "!");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return x == a.x;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
