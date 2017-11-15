package example.pattern.strategy;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午6:58:13
 **/
public class Context
{

    private CashSrategy cashSrategy = null;
    
    public Context(CashSrategy cashSrategy)
    {
        // TODO Auto-generated constructor stub
        this.cashSrategy = cashSrategy;
    }

    /**
     * 使用对应对象的算法
     */
    public void cashAlgorithm()
    {
        this.cashSrategy.cashAlgorithm();
    }
}