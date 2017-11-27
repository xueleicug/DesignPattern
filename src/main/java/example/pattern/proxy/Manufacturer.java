package example.pattern.proxy;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:54:06
 **/
public class Manufacturer implements Service
{
    private String customerName;

    public Manufacturer(String customerName)
    {
        // TODO Auto-generated constructor stub
        this.customerName = customerName;
    }

    @Override
    public void supplyProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer supply products for " + this.customerName);
    }

    @Override
    public void repairProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer repair products for " + this.customerName);
    }

    @Override
    public void updateProducts()
    {
        // TODO Auto-generated method stub
        System.out.println("Manufacturer uppdate products for " + this.customerName);
    }
}