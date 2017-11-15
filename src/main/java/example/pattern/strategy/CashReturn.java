package example.pattern.strategy;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午6:55:21
 **/
public class CashReturn extends CashSrategy
{
    private float returnValue;
    
    public CashReturn(float returnValue)
    {
        // TODO Auto-generated constructor stub
        this.setReturnValue(returnValue);
    }

    float getReturnValue()
    {
        return returnValue;
    }

    void setReturnValue(float returnValue)
    {
        this.returnValue = returnValue;
    }

    @Override
    public void cashAlgorithm()
    {
        // TODO Auto-generated method stub
        this.cashReturn();
    }
    
    /**
     * 反送算法
     */
    private void cashReturn()
    {
        System.out.println("charge by returning " + this.getReturnValue());
    }
}