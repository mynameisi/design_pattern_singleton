package singleton;

public class GoodServer {
	private int sNumber=0;
	//0. ���캯������Ϊprivate�ģ���֤���ܱ�������ʵ����
	private GoodServer(){
		sNumber=(int)(Math.random()*10);
	}
	//1. ϵͳ����ʱ���͹����һ����̬��GoodServer��ʵ��s
	private final static GoodServer s=new GoodServer();
	//2. ͨ��getServer������ù���õ�s
	public static GoodServer getInstance(){
		return s;
	}
	public void connect(){
		System.out.println("���ӵ�������: "+sNumber);
	}
}
