package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:23:50
 **/
public class SubFactory implements OperatorFactory
{

    public SubFactory()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Operation createOperator()
    {
        // TODO Auto-generated method stub
        Sub subOperator = new Sub();
        return subOperator;
    }
}