package act6p1.ej09;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance---");
        DistanceManager distanceContext = new DistanceManager(new EuclideanDistance());
        ClassifierManager classifierContext = new ClassifierManager(new ClassifierKnn(distanceContext));
        classifierContext.run();

        System.out.println("--- KNN with Manhattan distance---");
        distanceContext.setDistanceStrategy(new ManhattanDistance());
        classifierContext.run();

        System.out.println("--- K-means with Manhattan distance ---");
        classifierContext.setClassifierStrategy(new ClassifierKmeans(distanceContext));
        classifierContext.run();

        System.out.println("--- SOM  with Euclidean distance ---");
        classifierContext.setClassifierStrategy(new ClassifierSOM(distanceContext));
        distanceContext.setDistanceStrategy(new EuclideanDistance());
        classifierContext.run();
    }
}

