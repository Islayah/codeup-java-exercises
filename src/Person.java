public class Person {
//    Properties
    private String name;

//    Constructors
    public Person(String name) {
        this.name = name;
    }

//    Getters and Setters

//    Custom Methods
//    Getter
    public String getName() {
        return this.name;
    }
//    Setter
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name + "!");
    }

//    Main
    public static void main(String[] args) {
        Person person = new Person("Thor");
//        Testing Custom Methods
//        System.out.println(person.getName());
//        person.setName("Odinson");
//        System.out.println(person.getName());
//        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}


//    public static void sayHello(String greeting, String name) {
//        System.out.printf("%s, %s!\n", greeting, name);
//    }
