package singleton;

public enum GoodEServer {
	INSTANCE;//ÿһ��enum������ṩһ������
	
	private int sNumber=0;
	private GoodEServer(){
		sNumber=(int)(Math.random()*10);
	}
	
	public void connect(){
		System.out.println("���ӵ�������: "+sNumber);
	}
}


