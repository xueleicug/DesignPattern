package example.pattern.decorator;
/**
 *
 * @author xuelei xueleicug@163.com
 * @time   2015年1月14日 下午7:40:46
 **/
public class Uniform implements Decorator
{

	public Uniform() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("An Uniform");
	}
}
