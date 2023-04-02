public class Journalist implements Observer {
    public void update(String title, String type, String data) {
        if (type.equals("Game info")) {
            System.out.println("Новая игра выходит: " + title);
            System.out.println(data);
        }
    }
}