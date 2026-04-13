package oops.object_class;

public class Main {
    public static void main(String[] args) {
    Customer c1=new Customer();
    c1.name="Sneha";
        System.out.println(c1.name);
        c1.sayHello();
        Customer c2=new Customer("sneha",30,"guriya@gmail.com");
        System.out.println(c2.name+" "+c2.age+" "+c2.email);

    }
}
