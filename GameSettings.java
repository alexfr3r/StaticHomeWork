package StaticHomeWork;

public class GameSettings {
    // поля
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMaxPlayers) {
        GameSettings.maxPlayers = newMaxPlayers;
    }

    public void addPlayer() {
        this.currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Name of the game: " + this.gameName + ", current players: " + this.currentPlayers + ", max players: " + GameSettings.maxPlayers);
    }
}
