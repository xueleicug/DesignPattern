package example.pattern.adapter;

public class MB2GBAdapter implements GBSocket {

    private MBSocket mbSocket;

    public MB2GBAdapter(MBSocket mbSocket) {
        this.mbSocket = mbSocket;
    }

    @Override
    public void power220V() {
        this.mbSocket.power110V();
        System.out.println("适配器转换：将美标接口转换为国标接口，输出电压220V");
    }
}
