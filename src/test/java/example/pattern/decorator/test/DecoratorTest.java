package example.pattern.decorator.test;

import example.pattern.decorator.*;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {

        Police police = new Police();
        Pistol pistol = new Pistol();
        Uniform uniform = new Uniform();
        pistol.setComponent(police);
        uniform.setComponent(pistol);
        uniform.show();
        System.out.println();
        Teacher teacher = new Teacher();
        Book book = new Book();
        Glass glass = new Glass();
        book.setComponent(teacher);
        glass.setComponent(book);
        glass.show();
    }
}
