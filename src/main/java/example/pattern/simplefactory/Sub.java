package example.pattern.simplefactory;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 上午8:48:23
 **/
public class Sub extends Option
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