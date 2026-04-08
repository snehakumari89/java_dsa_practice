package oops;

class Customer{
    String name;
    String email;
    void print_details()
    {
        System.out.println(name);
        System.out.println(email);
    }
}
public class class_pb2_customer {
    public static void main(String[] args)
    {
       Customer C1=new Customer();
       C1.name="Sneha Kumari";
       C1.email="Snehavr1996@gmail.com";
       C1.print_details();
    }
}
