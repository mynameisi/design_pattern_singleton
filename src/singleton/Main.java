package singleton;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******************差服务器*******************");
		for (int i = 0; i < 5; i++) {
			BadServer s = new BadServer();
			s.connect();
		}
		
		System.out.println("\n******************好服务器*******************");
		for (int i = 0; i < 5; i++) {
			GoodServer s = GoodServer.getInstance();
			s.connect();
		}
		
		System.out.println("\n******************好E服务器*******************");
		for (int i = 0; i < 5; i++) {
			GoodEServer s = GoodEServer.INSTANCE;
			s.connect();
		}
		
	}

}
