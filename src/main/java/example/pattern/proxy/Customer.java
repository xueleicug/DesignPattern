package example.pattern.proxy;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:54:50
 **/
public class Customer
{
    private String name;
    
    public Customer(String name)
    {
        // TODO Auto-generated constructor stub
        this.setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}