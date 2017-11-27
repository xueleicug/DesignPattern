package example.pattern.proxy.test;

import example.pattern.proxy.Customer;
import example.pattern.proxy.Proxy;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy() {
        Customer customer = new Customer("Tom");
        Proxy proxy = new Proxy(customer);
        proxy.supplyProducts();
        System.out.println();
        proxy.repairProducts();
        System.out.println();
        proxy.updateProducts();
    }
}
