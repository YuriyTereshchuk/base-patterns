package tereshchuk.yuriy.basepatterns.creational.factorymethod;

public class WoodWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Lumber working!!!");
    }
}
