import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, surname;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("What is your surname?");
        surname = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextInt();
        scanner.nextLine();


        String fullname = name + " " + surname;
        System.out.println("Your name is " + fullname + ".");
        System.out.println("You are " + age + " years old.");


    }
}