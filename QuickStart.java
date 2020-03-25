import java.util.*;

class QuickStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some information:");
        String information = scanner.nextLine();
        System.out.print("You Entered: " + information + "\n");
        scanner.close();
    }
}