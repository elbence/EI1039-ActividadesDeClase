package act6p1.ej09;

public class ClassifierKmeans implements Classifier {
    DistanceManager distanceManager;
    public ClassifierKmeans(DistanceManager distanceContext) {
        distanceManager = distanceContext;
    }

    @Override
    public void train() {
        distanceManager.measure();
        System.out.println("Classifier KMeans is Trained");
    }

    @Override
    public void guess() {
        System.out.println("Classiefier KMeans prepared to guess values");
    }
}
