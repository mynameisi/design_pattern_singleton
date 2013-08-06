package singleton;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("******************�������*******************");
		for (int i = 0; i < 5; i++) {
			BadServer s = new BadServer();
			s.connect();
		}
		
		System.out.println("\n******************�÷�����*******************");
		for (int i = 0; i < 5; i++) {
			GoodServer s = GoodServer.getInstance();
			s.connect();
		}
		
		System.out.println("\n******************��E������*******************");
		for (int i = 0; i < 5; i++) {
			GoodEServer s = GoodEServer.INSTANCE;
			s.connect();
		}
		
	}

}
