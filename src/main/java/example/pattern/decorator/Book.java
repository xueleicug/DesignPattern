package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015��1��14�� ����7:41:45
 **/
public class Book extends Decorator
{

	public Book()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
		super.show();
		System.out.println("with a book");
	}
}
