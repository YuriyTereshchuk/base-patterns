package tereshchuk.yuriy.basepatterns.creational.factorymethod;

public class WoodWorkerFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new WoodWorker();
    }
}
