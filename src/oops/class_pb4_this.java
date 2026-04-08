package oops;

class Traitor{
    String name;
    int age;
    Traitor(String name)
    {
        this.name=name;
    }
    Traitor(String name,int age)
    {
        this.name=name;
       this.age=age;
    }
public static class class_pb4_this {
    public static void main(String[] args) {

        Traitor T1 = new Traitor("Guria");
        System.out.println(T1.name);
        Traitor T2 = new Traitor("abc", 10);
        System.out.println(T2.name);
        System.out.println(T2.age);

    }
}
}
