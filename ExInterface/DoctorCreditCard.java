package ExInterface;

public class DoctorCreditCard implements CreditCard {
    private int point = 0;

    @Override
    public void addPoint() {
        point += 2;
    }

    @Override
    public void usePoint() {
        point -= 1;
    }

    public int returnPoint() {
        return point;
    }

}
