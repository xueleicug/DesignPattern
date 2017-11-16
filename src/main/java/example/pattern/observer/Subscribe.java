package example.pattern.observer;

public class Subscribe implements ISubscribe {

    private String name;

    public Subscribe(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println("订阅者 " + this.name + " 获取到消息 " + msg);
    }
}
