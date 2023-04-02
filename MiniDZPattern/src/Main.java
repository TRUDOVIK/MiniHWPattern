public class Main {
    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();

        Observer player1 = new Player();
        Observer player2 = new Player();
        Observer journalist = new Journalist();
        Observer developer = new Developer();

        gameConsole.registerObserver(player1);
        gameConsole.registerObserver(player2);
        gameConsole.registerObserver(journalist);
        gameConsole.registerObserver(developer);

        gameConsole.newGame("Battlefield 2042", "Получить от игры удовольствие", "Худшая игра за все время", "Игра не оптимизированна");

        gameConsole.removeObserver(player2);
        gameConsole.newGame("Heroes and Generals", "Взорвать велосипедом 50 союзных танков", "Шедевр", "Разрабы майнят с твоего компа");

    }

}