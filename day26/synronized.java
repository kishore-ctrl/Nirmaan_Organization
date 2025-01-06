package day26;
class Ex{
	int num=0;
	 void inc() {
		num++;
	}
}
public class synronized {
	public static void main(String[] args) {
		Ex ex=new Ex();
		Thread tr=new Thread() {
			public void run() {
				for(int i=1;i<=10000;i++) {
					ex.inc();
				}
			}
		};
		
		Thread tr1=new Thread() {
			public void run() {
				for(int i=1;i<=10000;i++) {
					ex.inc();
				}
			}
		};
		tr.start();
		tr1.start();
		try {
			tr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			tr1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ex.num);
	}
	

}
