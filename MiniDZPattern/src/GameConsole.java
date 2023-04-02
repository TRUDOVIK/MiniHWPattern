import java.util.ArrayList;
public class GameConsole implements Subject {
    private ArrayList<Observer> observers;
    private String currentTitle;

    public GameConsole() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String title, String type, String data) {
        for (Observer o : observers) {
            o.update(title, type, data);
        }
    }

    public void newGame(String title, String achievements, String gameInfo, String techData) {
        currentTitle = title;
        String achievementsData = "Достижения: " + achievements;
        String gameInfoData = "Информация об игре: " + gameInfo;
        String techDataData = "Техническая информация: " + techData;
        notifyObservers(title, "Achievements", achievementsData);
        notifyObservers(title, "Game info", gameInfoData);
        notifyObservers(title, "Technical data", techDataData);
    }
}
