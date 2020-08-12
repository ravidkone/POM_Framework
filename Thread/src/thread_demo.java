
public class thread_demo implements Runnable{

	public String sName;
	Thread myThread;
	
	public thread_demo(String name) {
	this.sName = name;
	}
	//12:05PM PST
	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("Thrad Name = "+sName+" Count"+i);
			try {
			Thread.sleep(1000); // Wait for 1000 miliseconds 1 seconds
			}catch(Exception a) {
				System.out.println("Thread is interrepted"+a);
			}
		}
		
	}
	
	public void start() {
		System.out.println("Thread Started"+sName);
		if(myThread == null) {
			myThread = new Thread(this,sName);
			myThread.start();//ThreadOne will do task
			
		}
		//run();
	}
}
