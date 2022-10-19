package ExInterface;

public class TestMain {
    public static void main(String[] args) {
        DoctorCreditCard d1 = new DoctorCreditCard();
        StudentCreditCard s1 = new StudentCreditCard();
        d1.addPoint();
        s1.addPoint();
        System.out.println(d1.returnPoint());
        System.out.println(s1.returnPoint());
    }
}
