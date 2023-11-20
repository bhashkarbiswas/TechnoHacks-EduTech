import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewItems();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter the item to add: ");
        String newItem = scanner.nextLine();
        toDoList.add(newItem);
        System.out.println("Item added: " + newItem);
    }

    private static void removeItem(Scanner scanner) {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty. Nothing to remove.");
        } else {
            System.out.println("Current to-do list:");
            viewItems();

            System.out.print("Enter the index of the item to remove: ");
            int indexToRemove = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                String removedItem = toDoList.remove(indexToRemove);
                System.out.println("Item removed: " + removedItem);
            } else {
                System.out.println("Invalid index. Please enter a valid index.");
            }
        }
    }

    private static void viewItems() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("Current to-do list:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
