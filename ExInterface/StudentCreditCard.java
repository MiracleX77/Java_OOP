package ExInterface;

public class StudentCreditCard implements CreditCard {
    private int point = 0;

    @Override
    public void addPoint() {
        point += 3;
    }

    @Override
    public void usePoint() {
        point -= 1;
    }

    public int returnPoint() {
        return point;
    }

}
