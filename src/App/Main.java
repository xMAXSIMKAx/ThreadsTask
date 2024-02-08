package App;

import App.Controler.ThreadsController;

public class Main {
    public static void main(String[] args) {
        ThreadsController threadsController = new ThreadsController();
        threadsController.startThreads();
    }

}
