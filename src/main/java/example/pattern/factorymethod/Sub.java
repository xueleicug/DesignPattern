package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:19:25
 **/
public class Sub extends Operation
{

    public Sub()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getResult()
    {
        // TODO Auto-generated method stub
        double result = this.factor1 - this.factor2;
        return result;
    }
}