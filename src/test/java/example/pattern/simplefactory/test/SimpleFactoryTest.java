package example.pattern.simplefactory.test;

import example.pattern.simplefactory.Shape;
import example.pattern.simplefactory.ShapeFactory;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.show();

        Shape circle = shapeFactory.createShape("circle");
        circle.show();
    }
}
