package ExAdstract;

public abstract class CreditCard {

    public int point = 0;

    public void addPoint() {

    }

    public void usePoint() {
        point += 1;
    }

    public int returnPoint() {
        return point;
    }
}