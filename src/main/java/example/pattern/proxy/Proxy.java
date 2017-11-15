package example.pattern.proxy;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:57:41
 **/
public class Proxy implements Service
{
    Customer customer =null;
    Manufacturer manufacturer = null;
    public Proxy(Customer customer)
    {
        // TODO Auto-generated constructor stub
        this.customer = customer;
        this.manufacturer = new Manufacturer(this);
    }

    @Override
    public void supplyProducts()
    {
        // TODO Auto-generated method stub
        this.manufacturer.supplyProducts();
        System.out.println("by Proxy");
    }

    @Override
    public void repairProducts()
    {
        // TODO Auto-generated method stub
        this.manufacturer.repairProducts();
        System.out.println("by Proxy");
    }

    @Override
    public void updateProducts()
    {
        // TODO Auto-generated method stub
        this.manufacturer.updateProducts();
        System.out.println("by Proxy");
    }
}