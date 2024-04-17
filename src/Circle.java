public class Circle extends Shape {

    public static final double PI = 3.14;
    int r;
    @Override
    public void calculateArea(){
        System.out.println("Circle area is : " + (r*r*PI));
    }

}
