package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:18:25
 **/
public class Add extends Operation
{

    public Add()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getResult()
    {
        // TODO Auto-generated method stub
        double result = this.factor1 + this.factor2;
        return result;
    }
}