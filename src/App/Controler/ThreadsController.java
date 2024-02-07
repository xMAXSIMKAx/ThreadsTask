package App.Controler;

import App.Entity.FruitsThread;
import App.Entity.VegetablesThread;

public class ThreadsController {
    private FruitsThread fruitsThread;
    private VegetablesThread vegetablesThread;

    public ThreadsController() {
        this.fruitsThread = new FruitsThread();
        this.vegetablesThread = new VegetablesThread();

    }
    public void StartThreads() {
        vegetablesThread.run();
        fruitsThread.run();

    }
}
