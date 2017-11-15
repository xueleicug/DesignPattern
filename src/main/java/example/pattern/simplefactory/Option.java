package example.pattern.simplefactory;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 上午8:36:59
 **/
public abstract class Option
{
    protected double factor1;
    protected double factor2;
    
    /**
     * 设置算子值
     * @param factor1　第一个算子
     * @param factor2　第二个算子
     */
    public void setFactors(double factor1, double factor2)
    {
        this.factor1 = factor1;
        this.factor2 = factor2;
    }
    
    /**
     * 获得计算结果
     */
    public abstract double getResult();
}