/**
 * This program was written simply to demonstrate all the basic Java statements
 * taught in Sololearn.com Java course and other similar beginner courses.
 * You can both read it and run it. Use it as an interactive Java cheat sheet.
 * Written by Lukáš Tomek in IntelliJ Idea.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        int ee = 4;
        a -= x; //the same as a = a - x;
        b += x; //the same as b = b + x; etc.
        c *= x;
        d /= x;
        ee %= x;

        // ----- CONVERTING VARIABLE TYPES -----

        //String to int
        String myStringValue = "121314";
        int myIntegerValue1 = Integer.valueOf(myStringValue);  //valueOf puts the integer into object (=BOXING) and assigning it to integer
                                                               //variable is actually UNBOXING (from object to primitive value)
        int myIntegerValue2 = Integer.parseInt(myStringValue); //This is better in this case - parseInt returns value (not value in object).
        //to double: Double.valueOf(myStringValue);
        //to boolean: Boolean.valueOf(myStringValue);   //This is case insensitive. Other string than "true" returns false.

        System.out.println(myIntegerValue1);

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
        //IntelliJ Idea shortcut: sout
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
        System.out.println(ee);

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
        } else if (age<18) {   //if one of the conditions is true, the rest of the else if/else conditions will be ignored!
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
            if (test == 3) {
                int number_in_loop = 1;  //variables introduced in a loop work only within the loop!
                continue; //returns to the start of the loop
            }
            if (test == 2) {
                break; //jumps out of the loop (will ignore the rest of the code in the loop)
            }
        }

        //this loop will run at least once, even if the condition is not true
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

        //usage or CALL of a method (the method is DECLARED later in this file)
        sayHi();
        sayHi();

        //call of a method with PARAMETERS (=input values) and RETURN value (= output value)
        System.out.println(mySum(5,9));

        //creating an object from a class (class declaration: see end of this file)
        Dog my_dog = new Dog();
        //note: the new object is created just by "new Dog()". In variable "my_dog" is not the object but only an address pointing to the object (=reference)!
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
        double m10 = Math.PI;              //pi
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);
        System.out.println(m8);
        System.out.println(m9);
        System.out.println(m10);

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
           • final method can't be overridden
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

        // ----- ABSTRACT CLASS, ABSTRACT METHOD ----- (see the classes at the end of this file)

        Order fedEx_order = new FedEx();    //"Order" is the abstract class
        //"FedEx fedex_order = new FedEx();" would work too
        fedEx_order.sendOrder();

        /*
          ----- INTERFACE ----- (see the classes at the end of this file)
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
            • in .equals() method override (when comparing 2 objects)
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
                                                           point to the *same reference* (if obj_a==obj_b also returns true)!

          • If we want to compare 2 objects having DIFFERENT IDENTITY (different reference) but the SAME CONTENTS, we must create
            our own equals() override.
          • In order to other things work lately, we must also create hashCode() override.
          • In other words: default .equals() is specific, our overridden .equals() will be more general.
          • How to do it in Intellij Idea: place the cursor on the right place in code (in the class upon which we want to call equals() method),
            in menu choose Code>Generate>equals() and hashCode()
          • Advantage: when generating the equals() override, we can customize it (e.g. choose what fields (attributes, variables) to compare
            which makes it more efficient. Comparing everything in 2 objects would be very slow in some cases.

            ----- ENUM demonstration ----- (for the enum, see classes at the end of this file)
        */

        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);

        /* ----- JAVA API -----
           • API = Application Programming Interface
           • Java API is a collection of classes and interfaces that have been written for you to use
           • List and documentation: https://docs.oracle.com/en/java/javase/19/docs/api/index.html
           • import the complete needed package: import java.util.*;

           ----- EXCEPTION HANDLING (TRY-CATCH) -----
           • Exception = “unwanted or unexpected event”, which occurs during the execution of the program (at run-time) and terminates it.
             • Examples:
               • invalid data entered by a user
               • opening a file that does not exist
               • lost network connection
               • insufficient memory
               (3 types: user error, programmer error, physical resource issue)
           • Try-catch is used to prevent the termination of the entire program due to possible errors in a particular block of code.


        We await that in the "try" block, an exception could occur */
        try {
            int my_array[ ] = new int[2];
            System.out.println(my_array[5]);  //this is wrong
        /* • If the type of exception that occurred is listed in a catch block, the exception is passed to the catch block
             like an argument into a method.
           • The "Exception" type can be used to catch all possible exceptions.
           • We can use one catch block or multiple catch blocks that handle different exceptions separately.
             • Order catch blocks from specific to general
             • After specific exceptions, you can use the Exception type to handle all other exceptions as the last catch.
        */
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Array Index Out Of Bounds!");
        } catch (Exception e2) {
            System.out.println("An error occurred!");
        }
        /* Without try-catch, this program would crash.

          ----- THROWS, THROW -----
         • The "throws" keyword indicates what exception type may be thrown by a method
         • There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, InputMismatchException etc.
         */
        try {
            System.out.println(division(42, 0));     //the exception is thrown to the caller and caught in the "catch" part
        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero - caught in the main() method!");
        }

        /*
         ----- THREADS -----
         • Java = multi-threaded programming language.
         • We can subdivide specific operations within a single application into individual threads that all run in parallel.
           • Used often in e.g. games.
         • Every main Java program implicitly runs in 1 Main Thread.
         • life-cycle of a thread:

                      NEW         →───── stop() →──
                       ↓                            ╲
                     start()                          ╲
                       ↓                                ╲
           ┌──────→ RUNNABLE      →───── stop() →─────────
           │         ↓    ↑                                ╲
           │      run() yield()                              ╲
           │         ↓    ↑                                    ╲
        resume()    RUNNING       →───── end of execution →───── DEAD (KILLED)
        notify()       ↓                                       ╱
           │        suspend()                                ╱
           │         wait()                                ╱
           │         sleep()                             ╱
           │           ↓                               ╱
           └─────←  BLOCKED,      →───── stop() →─────
                   (SUSPENDED,
                    SLEEPING,
                    WAITING,
                     IDLE)
         • 2 methods, how to create new threads:
           1) EXTEND THREAD CLASS
         */

        PlayMusic pmObj = new PlayMusic();
        pmObj.start();     /* • start() method is defined in Thread class. It prepares this thread in memory (allocates memory, processor etc.).
                                After that it runs the overridden .run() method in our PlayMusic class (see the end of this file) = runs the thread.
                              • start() is like starting a car (and also checking battery, gas...), run() like driving it

           • Every thread has a priority to help the operating system determine the order in which to schedule threads.
           • Minimum is 1, maximum is 10, default is 5. We can set it.
        */
        DrawImage diObj = new DrawImage();
        System.out.println("Default priority of the thread is: " + diObj.getPriority());
        diObj.setPriority(7);
        diObj.start();

        //2) IMPLEMENTING THE RUNNABLE INTERFACE (better way)
        Thread mnObj = new Thread(new MoveNpc());
        mnObj.start();

        /* ----- TYPES OF EXCEPTIONS -----
           • CHECKED - checked when compiled. Program will not compile until not corrected. IDE will suggest correcting the code.
             • subclasses of java.lang.Exception
             • ex.: InterruptedException (when using Thread.sleep())
           • UNCHECKED (RUNTIME) - checked at runtime.
             • subclasses of java.lang.RuntimeException
             • ex.: ArithmeticException (when dividing by zero)

           ----- L I S T -------
           ----- ARRAYLIST -----
           • array of objects
           • not fixed length (when objects added, it enlarges, when objets removed, it may shrink)
           • "import java.util.ArrayList" is needed
         */

        //we create it the same way as any object
        ArrayList colors1 = new ArrayList();

        /* • Optional: specify TYPE and CAPACITY of objects the ArrayList will hold
           • ArrayList stores objects - the type must be class
           • If you need to store primitive variables (like "int"), use wrapper class instead (Integer)
             • wrapper class = class with just one field (attribute) with the primitive type variable
             • Java contains wrapper classes for all primitive variables (Byte, Short, Integer, Long, Float, Double, Character, Boolean),
               so we can treat them like an object, if needed
         */
        ArrayList<String> colors2 = new ArrayList<String>(10);
        //.add() - adding an object
        colors2.add("Red");
        colors2.add("Blue");
        colors2.add("Green");
        colors2.add("Orange");

        //.remove() - removing an object
        colors2.remove("Green");

        //.contains() - returns true if the list contains the specified element
        if (colors2.contains("Orange")) {
            System.out.println("Orange is in ArrayList.");
        }

        //.get(int index) - returns the element at the specified position in the list
        System.out.println("The first object in ArrayList: " + colors2.get(0));

        //.size() - returns the number of elements in the list
        System.out.println("Number of elements in ArrayList: " + colors2.size());

        System.out.println("ArrayList colors2: " + colors2);

        //.clear() - removes all the elements from the list
        colors2.clear();

        System.out.println("ArrayList is now empty: " + colors2);

        /* ----- LINKEDLIST -----
           • LinkedList vs. ArrayList
             • ArrayList - better for rapid STORING and ACCESSING data, similar to array
             • LinkedList - better for MANIPULATING data (e.g.: large number of inserts, deletes)
           • LinkedList stores in one NODE (=element):
             1) the object
             2) memory address (or link) of the element that follows it
           • LinkedList is stored in non-contiguous locations, unlike Arrays
           • not possible to specify initial capacity
           • "import java.util.LinkedList" is needed
         */

        //statement is the same as ArrayList and there are similar methods
        LinkedList<String> colors3 = new LinkedList<String>();

        /* ----- M A P -------
           ----- HASHMAP -----
           • HashMap = maps value (KEY) to value (VALUE) and uses hash function for searching in the map
           • advantage: it is possible to very quickly search for a value
             • to achieve very quick search, HashMap class uses internally hash function in this way:
               KEY → hashing function → hashcode value (=hash) → index in hashing table
               • hash function maps data of arbitrary size (KEY) to fixed-size values (hash value)
                 (even if KEY is a long string, its hash is short)
                 (it is like a dictionary that translates KEY to HASH VALUE)
               • hash function generates very different hash values for similar input parameters (KEYs) and minimize number of collisions
                 (so every KEY has almost always its unique hash value)
               • because search is performed on the hashing table and not on KEYs, it is very quick
               • hash values and hashing table do not take much space, it is storage space-efficient
           • it is like an array of objects, but instead of an implicit index, we can specify explicitly KEY
           • we store KEY-VALUE pair (which is a data collection)
          • HashMap cannot contain duplicate keys (duplicate values are OK). Adding a new item with a key that already exists overwrites the old element.
          • only 1 key can be "null", any value can be "null"
          • doesn’t maintain order of elements
          • note: if we need to maintain order, we can use LinkedHashMap (ordered by insertion) or TreeMap (ordered by order of keys - slower with big data!)
         */

        HashMap<String, Integer> points = new HashMap<String, Integer>();
        //put() - add key-value
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        //remove() - remove the mapping
        points.remove("Rob");
        //containsKey()
        if (points.containsKey("Amy")){
            System.out.println("Amy KEY is in this map.");
        }
        //containsValue()
        if (points.containsValue(154)){
            System.out.println("Value 154 is in this map.");
        }
        //get() - get value under key
        System.out.println(points.get("Dave"));

        /* ----- S E T -----
           ----- HASHSET -----
           • stores objects
           • can not store duplicate objects (and only 1 null value is permitted)
             • advantage: avoids duplicates
           • doesn’t maintain order of elements, you can’t find the position of element in HashSet
           • hashCode() is used internally for indexing and comparison (because of this, when we override equals(), we have to also override hashCode() for a class)
           • compared to ArrayList, HashSet has quicker searching and data access in huge data (because of the HashMap and hash table that is behind it)
             • HashSet - contains - O(1) (constant time to find a value no matter how big is the database)
             • ArrayList - contains - O(n) (with bigger data, the time to search is longer) ("O(n)" is called Big O notation")
           • note: if we need to maintain order, we can use LinkedHashSet or TreeSet
         */

        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("HashSet set: " + set);
        System.out.println("HashSet set size: " + set.size());

        /* ----- SORTING LISTS (COLLECTIONS CLASS) -----
           • java.util.Collections class - for the manipulation of data in various collection types
           • static methods, can be called directly from class
           • sort() - sorts elements
         */

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        animals.add("!bear");
        animals.add("1mouse");
        animals.add("2elephant");
        animals.add("Cat");
        animals.add("Dog");

        Collections.sort(animals);
        /* • result: !bear, 1mouse, 2elephant, Cat, Dog, cat, dog, snake, tiger
           • it places uppercase first (based on ASCII values)
           • time complexity: O(nlog(n))
           • auxiliary space: O(1)
         */
        System.out.println(animals);

        /* • if we need to sort it according to our own rules, we use Comparator interface (built in, or we can create own)
           • sort(List list, ComparatorClass c)
         */
        Collections.sort(animals, String.CASE_INSENSITIVE_ORDER);
        System.out.println(animals);

        //returns minimal element
        String min_animal = Collections.min(animals);
        System.out.println(min_animal);

        //returns maximal element
        String max_animal = Collections.max(animals);
        System.out.println(max_animal);

        //reverses order of elements
        Collections.reverse(animals);
        System.out.println(animals);

        //randomizes order of elements
        Collections.shuffle(animals);
        System.out.println(animals);

        /* ----- ITERATORS -----
           • it is a way to loop through (=iterate) various data structures
           • Iterator is an object
           • import java.util.Iterator
           • different implementation for different data set
           • imagine iterator to start BEFORE the first element (not ON the first element)
         */

        ArrayList<Integer> my_list = new ArrayList<Integer>();
        my_list.add(15);
        my_list.add(22);
        my_list.add(12);
        my_list.add(100);

        Iterator it = my_list.iterator();    //iterator() places the iterator to the start (before the first element)
        System.out.println(it.next());   //prints 15 (the first element)
        System.out.println(it.next());   //prints 22
        System.out.println(it.next());   //prints 12
        it.remove();                     //removes 12
        System.out.println(it.next());   //prints 100

        //Iterator stores objects, so to store it in a variable as object, we must add a type parameter:
        Iterator<Integer> it2 = my_list.iterator();  //=everything in my Iterator will be a String object
        Integer print_me = it2.next();
        System.out.println(print_me);   //prints 15

        if (it2.hasNext()) {            //returns true, if there is next element
            System.out.println(it2.next());
        }

        System.out.println("Let's loop through my_list!");
        //using while and hasNext, we can loop through
        Iterator<Integer> it3 = my_list.iterator();
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }

        System.out.println("Let's loop through my_list once again!");
        //looping through using for each (newer versions of Java)
        for (Integer o : my_list) {
            System.out.println(o);
        }

        //ITERATING THROUGH MAP
        HashMap<String, Integer> players = new HashMap<String, Integer>();

        int max_number = 0;
        String max_name = "";
        for (Map.Entry<String, Integer> my_set : players.entrySet()) {    //• map entry = key-value pair
                                                                          //• entry set = set of all entries
            //this finds the biggest value
            if (my_set.getValue() > max_number) {
                max_number = my_set.getValue();
                max_name = my_set.getKey();
            }
        }

        /* ----- WORKING WITH FILES -----
           • import java.io.File
         */

        //creating a File object, \ are escaped
        File my_file = new File("C:\\Program Files\\GIMP 2\\bin\\gimp-2.10.exe");

        if(my_file.exists()) {                                                              //exists() returns true if the file exists
            System.out.println(my_file.getName() +  " exists! Gimp 2.1 installed!");        //getName() returns the name of the file
        }
        else {
            System.out.println("The file does not exist");
        }

        //Reading file contents
        try {
            File my_file2 = new File("C:\\Program Files\\GIMP 2\\etc\\fonts\\conf.d\\README");
            Scanner read_file = new Scanner(my_file2);             //before reading a file, we should set CHARSET and CHARTER!
            //The Scanner class inherits from the Iterator, so it behaves like one.
            while(read_file.hasNext()) {
                System.out.println(read_file.nextLine());
            }
            read_file.close();    //it is good to close the file, but this should be done by TRY WITH RESOURCES, not like this!
                                  //reason: if it throws an exception, the file would not be closed
                                  //TRY WITH RESOURCES will automatically close the file
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is missing.");
        }

        //Creating a new file
        try {
            /* • folders must already exist, this does not create folders
               • this can not create file at places, where you need administrator access (e.g. C drive root in Windows)
                 • administrator access can be obtained only by running this program as administrator
             */
            Formatter file = new Formatter("sololearn-test.txt");   /* • if the file already exists, this will overwrite it!
                                                                               • this will create file at where your Java project is */
            file.format("%s %s %s", "1","Peter", "Pan \r\n");
            /* ----- NEWLINE -----
               • Windows: \r\n (why: return (all the way to left), newline (go down))
               • Linux: \n
               • Mac: \r
               • platform independent: System.lineSeparator()
               • platform independent (works only sometimes, e.g. in printf): %n
             */
            file.format("%s %s %s", "2","Joe", "Green" + System.lineSeparator());   //Platform independent line separator
            file.format("%s %s %s", "3","Joseph", "Great");
            file.close();

            System.out.printf("Done%n");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    //------------------------------------------------METHODS---------------------------------------------------------
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

    /* ----- THROWS, THROW -----
     • The "throws" keyword indicates what exception type may be thrown by a method
     */
    static int division(int a, int b) throws ArithmeticException {      //multiple throws can be listed (comma separated)
        if(b == 0) {
            throw new ArithmeticException("Division by Zero - caught in the division() method!");    //we must throw object, so use "new"
        } else {
            return a / b;
        }
    }

//------------------------------------------------CLASSES---------------------------------------------------------
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

/* ----- ENUM -----
• "enum" is an abbreviation of "enumeration" (= list of constants)
  • convention: the list should go first, in all caps
  • every item on the list is internally converted to "public static final"
  • order of items is important
• example: card suits, planets, days of the week, months, choices on a menu
  • it is like saying: we decided, that there will be only 7 days in a week: MONDAY, TUESDAY, ... and we will use only these
• used when we know all possible values at compile time
• enum = class (we can also add variables, methods, constructors)
  • constructor will run with every loading of the enum (we can not explicitly create an object with "new" from enum)
• enum is often used in switch statements
 */

enum Difficulty {
    EASY,
    MEDIUM,
    HARD;
}

class Player{
    Player(Difficulty diff){
        //your code goes here
        switch (diff){
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
        }
    }
}

/* ----- THREAD - 1) EXTEND THE THREAD CLASS -----
 • Disadvantage! Because we extend Thread, we can not extend from any other class.
   • In real life, IMPLEMENTING THE RUNNABLE INTERFACE is used more.
 */

class PlayMusic extends Thread {
    public void run() {      /* Our own override of the .run() method. After .start() which prepares the thread, .run() will automatically run
                                this thread (=our .run() method) until the execution ended or the thread is killed or put to the waiting state.
                              */
        System.out.println("Playing music...");
    }
}

class DrawImage extends Thread {
    public void run() {
        System.out.println("Drawing image....");
    }
}

/* ----- THREAD - 2) IMPLEMENTING THE RUNNABLE INTERFACE -----
 • Here we could also extend from any class.
 */

class MoveNpc implements Runnable {
    public void run() {
        try {
            Thread.sleep(3000);  //Sleep for 3 seconds (Thread method). Can be interrupted and throw an exception, so always add try and catch!
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("NPC is walking...");
    }
}