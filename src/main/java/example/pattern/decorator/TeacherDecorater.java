package example.pattern.decorator;

/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:32:45
 **/
public class TeacherDecorater extends PeopleDecorator
{

    private Book book;

    private Glass glass;

    public TeacherDecorater(People people) {
        this.people = people;
        this.book = new Book();
        this.glass = new Glass();
    }

    @Override
    public void show() {
        System.out.println("A Teacher With:");
        glass.display();
        book.display();
    }
}
