package act6p1.ej09;

public class ClassifierManager {
    private Classifier classifier;
    public void run() {
        classifier.train();
        classifier.guess();
    }

    public ClassifierManager(Classifier classifier) {
        this.classifier = classifier;
    }

    public void setClassifierStrategy(Classifier classifier) {
        this.classifier = classifier;
    }
}
