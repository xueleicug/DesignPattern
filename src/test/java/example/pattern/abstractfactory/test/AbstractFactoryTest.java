package example.pattern.abstractfactory.test;

import example.pattern.abstractfactory.AbstractFactory;
import example.pattern.abstractfactory.GreenCircleFactory;
import example.pattern.abstractfactory.RedRectangleFactory;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {

        AbstractFactory redRectangleFactory = new RedRectangleFactory();
        redRectangleFactory.getShape().draw();
        redRectangleFactory.getColor().fill();

        AbstractFactory greenCircleFactory = new GreenCircleFactory();
        greenCircleFactory.getShape().draw();
        greenCircleFactory.getColor().fill();
    }

}
