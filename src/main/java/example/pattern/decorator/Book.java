package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:41:45
 **/
public class Book implements Decorator
{

	public Book()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("A Book");
	}
}
