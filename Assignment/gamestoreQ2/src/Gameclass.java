import java.util.ArrayList;
import java.util.List;

class Gameclass {
    private List<GenreGame> games = new ArrayList<>();

    public void setGame(String title, double price, String genre) {
        GenreGame game = new GenreGame(title, price, genre);
        games.add(game);
        System.out.println("Game added successfully!");
    }

    public void DisplayGames() {//outputs Games
        System.out.println("List of all games in the store:");
        for (GenreGame g : games) {
            System.out.println(g);
            System.out.println("-----------------------------");
        }
    }

    public List<GenreGame> searchGamesByGenre(String searchGenre) {
        List<GenreGame> matchingGames = new ArrayList<>();
        for (GenreGame g : games) {
            if (g.getGenre().equalsIgnoreCase(searchGenre)) {
                matchingGames.add(g);
            }
        }
        return matchingGames;
    }
}

class GenreGame {
    private String title;
    private double price;
    private String genre;

    public GenreGame(String title, double price, String genre) {
        this.title = title;
        this.price = price;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nPrice: R" + price + "\nGenre: " + genre;
    }
}

