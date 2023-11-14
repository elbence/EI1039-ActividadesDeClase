package act6p1.ej07;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("--- KNN ---");
        ClassifierManager context = new ClassifierManager(new ClassifierKnn());
        context.run();
        System.out.println("--- K-means ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.run();
        System.out.println("--- SOM ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.run();
    }
}

