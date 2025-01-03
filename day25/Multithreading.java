package day25;
 class example1 extends Thread{
	 public void run() {
			for(int i=1;i<=50;i++) {
				System.out.println("example1 :"+i);
			}
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 }
}
 
class example2 extends Thread{
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("example2 :"+i);
			
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Multithreading{
	public static void main(String[] args) {
		example1 ex1=new example1();
		example2 ex2=new example2();
		ex1.start();
		ex2.start();
	}
}



