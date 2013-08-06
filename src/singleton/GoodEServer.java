package singleton;

public enum GoodEServer {
	INSTANCE;//每一个enum先天就提供一个单例
	
	private int sNumber=0;
	private GoodEServer(){
		sNumber=(int)(Math.random()*10);
	}
	
	public void connect(){
		System.out.println("连接到服务器: "+sNumber);
	}
}


