package example.pattern.proxy;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:51:13
 **/
public interface Service
{
    /**
     * 提供商品
     */
    public void supplyProducts();
    
    /**
     * 维修商品
     */
    public void repairProducts();

    /**
     * 升级商品
     */
    public void updateProducts();
}