package act6p1.ej09;

public class ClassifierKnn implements Classifier {
    DistanceManager distanceManager;
    public ClassifierKnn(DistanceManager distanceContext) {
        distanceManager = distanceContext;
    }

    @Override
    public void train() {
        distanceManager.measure();
        System.out.println("Classifier Knn is Trained");
    }

    @Override
    public void guess() {
        System.out.println("Classiefier Knn prepared to guess values");
    }
}
