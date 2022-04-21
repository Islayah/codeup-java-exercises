import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

// Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
//
// Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
//        String [] person = new String[3];
//        Person person1 = new Person("Thor");
//        Person test2 = new Person("Iron Man");
//        Person test3 = new Person("Wanda");
//        for (int i = 0; i < person.length; i++) {
//            System.out.println(person[i]);
//        }

        Person[] people = new Person[3];
        people[0] = new Person("Thor");
        people[1] = new Person("Wanda");
        people[2] = new Person("Dr Strange");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person("Psylock"));

        System.out.println("Printing after add");

        for (Person person : people) {
            System.out.println(person.getName());
        }

//        Alternative way to declare
//        Person[] persons = {new Person("Thor"), new Person("Wanda"), new Person("Dr Strange")};
    }

    public static Person[] addPerson(Person[] personArray, Person personToAdd) {
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);

        newArray[newArray.length - 1] = personToAdd;

        return newArray;
    }
}
