import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner max = new Scanner(System.in);
        System.out.print("Current year: ");
        int currentYear = max.nextInt();
        System.out.print("Your birthyear: ");
        int birthYear = max.nextInt();
        System.out.print("Dogs birthyear: ");
        int dogBirthYear = max.nextInt();
        
        int dogAge = (currentYear-dogBirthYear) * 7;
        System.out.println("\nYou are "+ (currentYear - birthYear) + " real yars old.");
        System.out.println("Your dog is " + dogAge + " years old.");
        max.close();
    }
}