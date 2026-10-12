class Address {
    String city;
}

class Person {
    String name;
    Address address;
}

public class AddressPersonDemo {
    public static void main(String[] args) {
        Address a = new Address();
        a.city = "Harare";

        Person p = new Person();
        p.name = "Tariro";
        p.address = a;

        // Chained dot expression: person -> address -> city
        System.out.println(p.name + " lives in " + p.address.city);

        Person q = new Person();
        q.name = "Farai";
        q.address = null;

        // q.address.city; // This would throw NullPointerException

        if (q.address != null) {
            System.out.println(q.name + " lives in " + q.address.city);
        } else {
            System.out.println(q.name + " has no address on file");
        }
    }
}