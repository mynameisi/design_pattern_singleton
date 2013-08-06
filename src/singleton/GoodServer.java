package singleton;

public class GoodServer {
	private int sNumber=0;
	//0. 构造函数设置为private的，保证不能被调用来实例化
	private GoodServer(){
		sNumber=(int)(Math.random()*10);
	}
	//1. 系统载入时，就构造好一个静态的GoodServer的实例s
	private final static GoodServer s=new GoodServer();
	//2. 通过getServer方法获得构造好的s
	public static GoodServer getInstance(){
		return s;
	}
	public void connect(){
		System.out.println("连接到服务器: "+sNumber);
	}
}
