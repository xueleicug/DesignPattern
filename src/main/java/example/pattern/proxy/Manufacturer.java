package example.pattern.proxy;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:54:06
 **/
public class Manufacturer implements Service
{
    Proxy proxy = null;
    public Manufacturer(Proxy proxy)
    {
        // TODO Auto-generated constructor stub
        this.proxy = proxy;
    }

    @Override
    public void supplyProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer supply products for " + this.proxy.customer.getName());
    }

    @Override
    public void repairProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer repair products for " + this.proxy.customer.getName());
    }

    @Override
    public void updateProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer uppdate products for " + this.proxy.customer.getName());
    }
}