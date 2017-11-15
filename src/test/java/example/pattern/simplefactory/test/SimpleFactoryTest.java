package example.pattern.simplefactory.test;

import example.pattern.simplefactory.Option;
import example.pattern.simplefactory.OptionFactory;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory() {
        OptionFactory optionFactory = new OptionFactory();
        Option operator0 = optionFactory.createOperator("+");
        operator0.setFactors(20, 60);
        System.out.println(operator0.getResult());
        Option operator1 = optionFactory.createOperator("-");
        operator1.setFactors(20, 60);
        System.out.println(operator1.getResult());
    }
}
