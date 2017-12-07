package example.pattern.abstractfactory.AbstractFactory;

public class GreenCircleFactory implements AbstractFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }

    @Override
    public Color getColor() {
        return new Green();
    }
}
