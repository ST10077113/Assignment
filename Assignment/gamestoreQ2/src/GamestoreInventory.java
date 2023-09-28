import java.util.List;
import java.util.Scanner;

public class GamestoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gameclass obj= new Gameclass();

        while (true) {
            System.out.println("\nGame Store Inventory Management:");
            System.out.println("1. Add a Game");
            System.out.println("2. List All Games");
            System.out.println("3. Search Games by Genre");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Price: R");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    obj.setGame(title, price, genre);
                    break;
                case 2:
                    obj.DisplayGames();
                    break;
                case 3:
                    scanner.nextLine(); 
                    System.out.print("Enter Genre to search: ");
                    String searchGenre = scanner.nextLine();
                    List<GenreGame> matchingGames = obj.searchGamesByGenre(searchGenre);
                    System.out.println("Games in the " + searchGenre + " genre:");
                    for (GenreGame g : matchingGames) {
                        System.out.println(g);
                        System.out.println("-----------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Inventory Management.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


