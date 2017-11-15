package example.pattern.strategy;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午6:53:14
 **/
public class CashRebate extends CashSrategy
{
    private float rate;

    public CashRebate(float rate)
    {
        // TODO Auto-generated constructor stub
        this.setRate(rate);
    }

    @Override
    public void cashAlgorithm()
    {
        // TODO Auto-generated method stub
        this.cashRebase();
    }
    
    /**
     * 打折算法
     */
    private void cashRebase()
    {
        System.out.println("charge by rebating " + this.getRate());
    }

    public float getRate()
    {
        return rate;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }
}