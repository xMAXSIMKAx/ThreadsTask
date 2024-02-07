package App.Entity;

public class FruitsThread extends Thread {
    private String[] fruits = {"apple", "banana", "orange", "grape", "kiwi", "pine"};

    public void run() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
