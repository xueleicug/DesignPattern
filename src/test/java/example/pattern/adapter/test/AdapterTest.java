package example.pattern.adapter.test;

import example.pattern.adapter.*;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void testAdapter() {

        GBSocket gbSocket = new ConcreteGBSocket();
        gbSocket.power220V();

        MBSocket mbSocket = new ConcreteMBSocket();
        GBSocket adapter = new MB2GBAdapter(mbSocket);
        adapter.power220V();
    }
}
