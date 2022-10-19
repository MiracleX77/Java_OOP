public class TestCircle {
    public static void main(String[] args) {
        Circle c1= new Circle();
        System.out.println("The circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
        Circle c2=new Circle(2.0);
        System.out.println("The circle has radius of "+c2.getRadius()+" and area of "+c2.getArea());
        Circle c3=new Circle();
        c3.setRadius(5.5);
        c3.setColor("green");
        System.out.println("The circle has radius of "+c3.getRadius()+" and Color of "+c3.getColor());
        Circle c4=new Circle();
        System.out.println(c4.toString());
        Circle c5=new Circle(5.5);
        System.out.println(c3);
        System.out.println(c5.toString());
        System.out.println(c5);
        System.out.println("Operator '+' invokes toString() too: " + c5);

    }
}
