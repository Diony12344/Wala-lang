import java.util.Scanner;
public class main{
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        
        System.out.println("\u001B[30m-----My Info-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

}
}
    