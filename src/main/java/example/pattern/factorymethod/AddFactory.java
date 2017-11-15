package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:20:46
 **/
public class AddFactory implements OperatorFactory
{

    public AddFactory()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Operation createOperator()
    {
        // TODO Auto-generated method stub
        Add addOperator = new Add();
        return addOperator;
    }
}