package example.pattern.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Publisher implements IPublisher {

    private Set<ISubscribe> subscribes;

    public Publisher() {
        this.subscribes = new HashSet<ISubscribe>();
    }

    public void attach(ISubscribe subscribe) {
        this.subscribes.add(subscribe);
    }

    public void detach(ISubscribe subscribe) {
        this.subscribes.remove(subscribe);
    }

    public void notify(String msg) {
        Iterator<ISubscribe> iterator = this.subscribes.iterator();
        while(iterator.hasNext()) {
            ISubscribe subscribe = iterator.next();
            subscribe.update(msg);
        }
    }
}
