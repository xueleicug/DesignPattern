package example.pattern.abstractfactory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Create Rectangle");
    }
}
