package singleton;

public class BadServer {
	int sNumber = 0;

	// �����һ��1��10�ŷ�����
	public BadServer() {
		sNumber = (int) (Math.random() * 10);
	}

	public void connect() {
		System.out.println("�û����ӵ�������: " + sNumber);
	}
}
