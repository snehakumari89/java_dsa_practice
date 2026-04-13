package oops.inheritanceAnimal;

public class Main {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();

        Dog d=new Dog();
        d.barks();

        Puppy p =new Puppy();
        p.sound();

    }
}
