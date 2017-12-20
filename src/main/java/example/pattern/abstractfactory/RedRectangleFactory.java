package example.pattern.abstractfactory;

public class RedRectangleFactory implements AbstractFactory {

    @Override
    public Shape getShape() {
        return new Rectangle();
    }

    @Override
    public Color getColor() {
        return new Red();
    }

}
