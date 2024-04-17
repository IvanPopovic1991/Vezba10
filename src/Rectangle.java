public class Rectangle extends Shape{

    int a,b;
    @Override
    public void calculateArea(){
        System.out.println("Rectangle area is : "+ (a*b));
    }
}
