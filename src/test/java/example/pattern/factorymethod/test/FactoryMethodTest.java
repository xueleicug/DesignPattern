package example.pattern.factorymethod.test;

import example.pattern.factorymethod.CircleFactory;
import example.pattern.factorymethod.RectangleFactory;
import example.pattern.factorymethod.Shape;
import example.pattern.factorymethod.ShapeFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {

        ShapeFactory circleFactory = new CircleFactory();
        Shape circleShape = circleFactory.createShape();
        circleShape.show();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangleShape = rectangleFactory.createShape();
        rectangleShape.show();
    }
}
