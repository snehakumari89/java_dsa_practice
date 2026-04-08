package oops;

class Person{
    String name;
    int age;
    void Say_Hello()
    {
        System.out.println("Hello my name is "+name);
    }
}
public class class_pb1 {
    public static void main(String[] args){
        Person p1=new Person();
        System.out.println(p1);
        p1.name="Sneha Kumari";
        p1.age=29;
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.Say_Hello();
    }
}
