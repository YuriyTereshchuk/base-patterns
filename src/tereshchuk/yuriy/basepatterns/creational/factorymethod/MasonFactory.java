package tereshchuk.yuriy.basepatterns.creational.factorymethod;

public class MasonFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Mason();
    }
}
