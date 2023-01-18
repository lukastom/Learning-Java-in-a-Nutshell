class Pokusy {
    public static void main(String[] args) {
        Animal1 dog = new Dog1();
        Animal1 cat = new Cat1();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();

    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal1 implements Swimmer, Player{
    public abstract void swim();

    public abstract void play();
}


class Dog1 extends Animal1 {
    //Override the swim() and the play() methods
    public void swim(){
        System.out.println("Dog is swimming");
    };
    public void play(){
        System.out.println("Dog is playing");
    };
}


class Cat1 extends Animal1 {
    //Override the swim() and the play() methods
    public void swim(){
        System.out.println("Cat is swimming");
    };
    public void play(){
        System.out.println("Cat is playing");
    };
}
