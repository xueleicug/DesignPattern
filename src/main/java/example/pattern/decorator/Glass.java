package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015��1��14�� ����7:42:34
 **/
public class Glass extends Decorator
{

	public Glass()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
		super.show();
		System.out.println("wearing a pair of glasses");
	}
}
