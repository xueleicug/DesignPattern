package example.pattern.decorator.test;

import example.pattern.decorator.*;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {

        People people = new Adult();
        People police = new PoliceDecorator(people);
        police.show();
        People teacher = new TeacherDecorater(people);
        teacher.show();
    }
}
