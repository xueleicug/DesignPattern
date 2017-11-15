package example.pattern.factorymethod.test;

import example.pattern.factorymethod.AddFactory;
import example.pattern.factorymethod.Operation;
import example.pattern.factorymethod.OperatorFactory;
import example.pattern.factorymethod.SubFactory;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void testFactoryMethod() {
        // TODO Auto-generated method stub
        OperatorFactory addFactory = new AddFactory();
        Operation addOperation = addFactory.createOperator();
        addOperation.setFactors(20, 40);
        System.out.println("the result of add is " + addOperation.getResult());

        OperatorFactory subFactory = new SubFactory();
        Operation subOperation = subFactory.createOperator();
        subOperation.setFactors(20, 40);
        System.out.println("the result of sub is " + subOperation.getResult());
    }
}
