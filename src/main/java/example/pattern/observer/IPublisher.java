package example.pattern.observer;

public interface IPublisher {

    public void attach(ISubscribe subscribe);

    public void detach(ISubscribe subscribe);

    public void notify(String msg);
}
