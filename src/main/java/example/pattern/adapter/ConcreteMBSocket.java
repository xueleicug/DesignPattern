package example.pattern.adapter;

public class ConcreteMBSocket implements MBSocket {

    public ConcreteMBSocket() {

    }

    @Override
    public void power110V() {
        System.out.println("美标接口输出电压110V");
    }
}
