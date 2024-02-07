package App.Model;

public class VegetablesThread extends Thread {
    private String[] vegetables= {"carrot", "cucumber", "lettuce", "onion", "potato", "tomato"};

    public void run() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
