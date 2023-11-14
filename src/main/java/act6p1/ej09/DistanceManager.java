package act6p1.ej09;

public class DistanceManager {
    private Distance distance;
    public void measure() {
        distance.measure();
    }

    public DistanceManager(Distance distance) {
        this.distance = distance;
    }

    public void setDistanceStrategy(Distance distance) {
        this.distance = distance;
    }
}
