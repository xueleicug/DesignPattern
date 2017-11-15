package example.pattern.simplefactory;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 上午8:49:32
 **/
public class OptionFactory
{

    public OptionFactory()
    {
        // TODO Auto-generated constructor stub
    }
    
    public Option createOperator(String operator)
    {
        Option option = null;
        switch(operator)
        {
            case "+":
                option = new Add();
                break;
            case "-":
                option = new Sub();
                break;
            default:
                option = null;
        }
        return option;
    }
}