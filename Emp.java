
public class Emp {
    public static void main(String[] args)
    {
        Employee e=new Employee();
        System.out.println("Details of the employee:");
        e.name="Ashmi";
        e.age=23;
        e.phone_number="9567761840";
        e.address="T Nagar, Chennai.";
        e.salary=40000;
        System.out.println("Name: "+e.name);
        System.out.println("Age: "+e.age);
        System.out.println("Phone number: "+e.phone_number);
        System.out.println("Address: "+e.address);
        e.emp();
        e.printSalary();
        Manager m=new Manager();
        System.out.println("\nDeatils of the manager:");
        m.name="Rahul";
        m.age=34;
        m.phone_number="9897667839";
        m.address="Anna nagar,Chennai";
        m.salary=60000;
        System.out.println("Name: "+m.name);
        System.out.println("Age: "+m.age);
        System.out.println("Phone number: "+m.phone_number);
        System.out.println("Address: "+m.address);
        m.emp1();
        m.printSalary();

    }
}