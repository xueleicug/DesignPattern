package example.pattern.simplefactory;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 上午8:41:15
 **/
public class Add extends Option
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