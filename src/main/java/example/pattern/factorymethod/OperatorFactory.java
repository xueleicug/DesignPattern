package example.pattern.factorymethod;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月15日 下午8:14:11
 **/
public interface OperatorFactory
{
    /**
     * 创建计算方式对象
     * @return　计算方式对象
     */
    Operation createOperator();
}