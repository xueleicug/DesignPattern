package example.pattern.adapter;

public class ConcreteGBSocket implements GBSocket {

    public ConcreteGBSocket() {

    }

    @Override
    public void power220V() {
        System.out.println("国标接口输出电压220V");
    }
}
