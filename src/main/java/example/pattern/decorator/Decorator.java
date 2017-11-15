package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015��1��14�� ����7:35:19
 **/
public class Decorator extends People
{

	private People component = null;
	
	public Decorator()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
		if(this.component != null)
		{
			this.component.show();
		}
	}
	
	/**
     * 设置当前的装饰
     * @param component
     */
	public void setComponent(People component)
	{
		this.component = component;
	}
}
