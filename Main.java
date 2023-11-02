import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите информацию о человеке (или 'стоп' для выхода):");
            System.out.print("Имя: ");
            String firstName = scanner.nextLine();
            if (firstName.equalsIgnoreCase("стоп")) {
                break;
            }
            System.out.print("Фамилия: ");
            String lastName = scanner.nextLine();
            System.out.print("Отчество: ");
            String middleName = scanner.nextLine();
            System.out.print("Пол: ");
            String gender = scanner.nextLine();
            System.out.print("Год рождения: ");
            int birthYear = scanner.nextInt();
            scanner.nextLine(); 

            Person person = new Person(firstName, lastName, middleName, gender, birthYear, "");

            System.out.print("Степень родства: ");
            String relationship = scanner.nextLine();
    
            

            System.out.print("Сколько детей у этого человека? ");
            int numChildren = scanner.nextInt();
            scanner.nextLine(); 

            for (int i = 0; i < numChildren; i++) {
                System.out.println("Введите информацию о ребенке " + (i + 1) + ":");
                System.out.print("Имя: ");
                String childFirstName = scanner.nextLine();
                System.out.print("Фамилия: ");
                String childLastName = scanner.nextLine();
                System.out.print("Отчество: ");
                String childMiddleName = scanner.nextLine();
                System.out.print("Год рождения: ");
                int childBirthYear = scanner.nextInt();
                scanner.nextLine(); 

                Person child = new Person(childFirstName, childLastName, childMiddleName, "", childBirthYear, "");
                person.addChildren(child);
            }

            familyTree.addPerson(person);
            System.out.println("Информация добавлена.");
        }

     
              try {
            FileWriter fileWriter = new FileWriter("genealogy.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Person person : familyTree.getPeople()) {
                printWriter.println("Имя: " + person.getFirstName());
                printWriter.println("Фамилия: " + person.getLastName());
                printWriter.println("Отчество: " + person.getMiddleName());
                printWriter.println("Пол: " + person.getGender());
                printWriter.println("Год рождения: " + person.getBirthYear());
                printWriter.println("Степень родства: " + person.getRelationship());
                printWriter.println("Дети: ");
                for (Person child : person.getChildren()) {
                    printWriter.println(child.getFirstName() + " " + child.getLastName());
                }
                printWriter.println();
            }

            printWriter.close();
            fileWriter.close();

            System.out.println("Информация сохранена в файл genealogy.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        
        System.out.println("Введите имя и фамилию человека, чтобы получить информацию о нем:");
        String searchFirstName = scanner.nextLine();
        String searchLastName = scanner.nextLine();
        Person person = familyTree.getPerson(searchFirstName, searchLastName);

        if (person != null) {
            System.out.println("Информация о человеке:");
            System.out.println("Имя: " + person.getFirstName());
            System.out.println("Фамилия: " + person.getLastName());
            System.out.println("Отчество: " + person.getMiddleName());
            System.out.println("Пол: " + person.getGender());
            System.out.println("Год рождения: " + person.getBirthYear());
            System.out.println("Степень родства: " + person.getRelationship());
            System.out.println("Дети: ");
            for (Person child : person.getChildren()) {
                System.out.println(child.getFirstName() + " " + child.getLastName());
            }
        } else {
            System.out.println("Человек не найден.");
        }
    }
}
