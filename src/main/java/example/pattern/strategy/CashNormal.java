package example.pattern.strategy;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午6:52:08
 **/
public class CashNormal extends CashSrategy
{

    public CashNormal()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void cashAlgorithm()
    {
        // TODO Auto-generated method stub
        this.cashNormal();
    }
    
    /**
     * 正常收费算法
     */
    private void cashNormal()
    {
        System.out.println("charge Normally");
    }
}