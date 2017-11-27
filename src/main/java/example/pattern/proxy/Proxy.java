package example.pattern.proxy;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:57:41
 **/
public class Proxy implements Service
{
    private Customer customer;

    private Manufacturer manufacturer;

    public Proxy(Customer customer)
    {
        // TODO Auto-generated constructor stub
        this.customer = customer;
        this.manufacturer = new Manufacturer(this.customer.getName());
    }

    @Override
    public void supplyProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Proxy get the supply request from customer " + this.customer.getName());
        System.out.println("Proxy forward the supply request of customer " + this.customer.getName() + " to manufacturer");
        this.manufacturer.supplyProducts();
        System.out.println("Proxy forward the supply result from manufacturer to customer " + this.customer.getName());
    }

    @Override
    public void repairProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Proxy get the repair request from customer " + this.customer.getName());
        System.out.println("Proxy forward the repair request of customer " + this.customer.getName() + " to manufacturer");
        this.manufacturer.repairProducts();
        System.out.println("Proxy forward the repair result from manufacturer to customer " + this.customer.getName());
    }

    @Override
    public void updateProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Proxy get the update request from customer " + this.customer.getName());
        System.out.println("Proxy forward the update request of customer " + this.customer.getName() + " to manufacturer");
        this.manufacturer.updateProducts();
        System.out.println("Proxy forward the update result from manufacturer to customer " + this.customer.getName());
    }
}