package act6p1.ej09;

public class ClassifierSOM implements Classifier {
    DistanceManager distanceManager;
    public ClassifierSOM(DistanceManager distanceContext) {
        distanceManager = distanceContext;
    }

    @Override
    public void train() {
        distanceManager.measure();
        System.out.println("Classifier Som is Trained");
    }

    @Override
    public void guess() {
        System.out.println("Classiefier Som prepared to guess values");
    }
}
