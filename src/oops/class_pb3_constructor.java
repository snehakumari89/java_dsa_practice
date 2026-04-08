package oops;

class Employee{
    String name;
    int age;
    Employee(String n)
    {
        name=n;
    }
    Employee(String n,int a)
    {
        name=n;
        age=a;
    }

}
public class class_pb3_constructor {
    public static void main(String[] args)
    {

        Employee E1=new Employee("sneha");
        System.out.println(E1.name);
        Employee E2=new Employee("tejas",10);
        System.out.println(E2.name);
        System.out.println(E2.age);

    }
}
