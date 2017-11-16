package example.pattern.observer.test;

import example.pattern.observer.IPublisher;
import example.pattern.observer.ISubscribe;
import example.pattern.observer.Publisher;
import example.pattern.observer.Subscribe;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void testObserver() {
        ISubscribe sub1 = new Subscribe("张三");
        ISubscribe sub2 = new Subscribe("李四");
        ISubscribe sub3 = new Subscribe("王五");

        IPublisher pub = new Publisher();
        pub.attach(sub1);
        pub.attach(sub2);
        pub.attach(sub3);
        pub.notify("新的版本即将发布");

    }
}
