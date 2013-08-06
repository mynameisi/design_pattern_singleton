package singleton;

public class BadServer {
	int sNumber = 0;

	// 随机找一个1～10号服务器
	public BadServer() {
		sNumber = (int) (Math.random() * 10);
	}

	public void connect() {
		System.out.println("用户连接到服务器: " + sNumber);
	}
}
