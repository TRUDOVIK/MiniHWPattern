public class Developer implements Observer {
    public void update(String title, String type, String data) {
        if (type.equals("Technical data")) {
            System.out.println("Новая игра выходит: " + title);
            System.out.println(data);
        }
    }
}