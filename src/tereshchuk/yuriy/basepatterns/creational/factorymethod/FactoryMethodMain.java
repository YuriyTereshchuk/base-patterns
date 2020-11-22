package tereshchuk.yuriy.basepatterns.creational.factorymethod;

public class FactoryMethodMain {

    public static void main(String[] args){
        WorkerFactory workerFactory = getWorkerFactory("woodworker");
        Worker worker = workerFactory.createWorker();
        worker.work();
    }

    private static WorkerFactory getWorkerFactory(String speciality) {
        if ("mason".equals(speciality)) {
            return new MasonFactory();
        } else if ("woodworker".equals(speciality)) {
            return new WoodWorkerFactory();
        } else {
            throw new RuntimeException("Speciality " + speciality + " is unknown.");
        }
    }
}
