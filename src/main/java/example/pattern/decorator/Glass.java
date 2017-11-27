package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:42:34
 **/
public class Glass implements Decorator
{

	public Glass()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("A Pair of Glasses");
	}
}
