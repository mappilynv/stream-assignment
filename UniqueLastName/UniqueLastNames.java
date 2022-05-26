package UniqueLastName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        while (true){
            System.out.println("Continue personal information input? \"quit\" ends:");
            String quit = scanner.nextLine();
            if(quit.equals("quit")){
                break;
            }
            System.out.println();
            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Input year of birth: ");
            String yearOfBirth = scanner.nextLine();

            Person person = new Person(firstName, lastName, Integer.valueOf(yearOfBirth));
            persons.add(person);

        }
        System.out.println("Unique last names in alphabetical order");
        persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(lastName -> System.out.println(lastName));

    }



}
