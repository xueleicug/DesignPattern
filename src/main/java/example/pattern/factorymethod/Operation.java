package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:14:54
 **/
public abstract class Operation
{
    protected double factor1;
    protected double factor2;
    
    /**
     * 设置参与运算的算子值
     * @param factor1　第一个算子
     * @param factor2　第二个算子
     */
    public void setFactors(double factor1, double factor2)
    {
        this.factor1 = factor1;
        this.factor2 = factor2;
    }
    
    /**
     * 获得计算机结果
     * @return　计算结果
     */
    public abstract double getResult();
}