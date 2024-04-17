public class Square extends Shape {

    int a;
    @Override
    public void calculateArea() {
        System.out.println("Square area is: " + (Math.pow(a, 2)));
    }
}