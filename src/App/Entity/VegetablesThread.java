package App.Entity;

public class VegetablesThread extends Thread {
    private String[] vegetables = {"carrot", "cucumber", "lettuce", "onion", "potato", "tomato\n"};

    public void run() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
