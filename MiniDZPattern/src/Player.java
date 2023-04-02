public class Player implements Observer {
    public void update(String title, String type, String data) {
        if (type.equals("Achievements")) {
            System.out.println("Новая игра выходит: " + title);
            System.out.println(data);
        }
    }
}