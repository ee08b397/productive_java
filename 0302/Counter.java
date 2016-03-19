public class Counter extends Thread {
	public void run() {
		for (int i = 0; i < 1000; ++i) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
/*
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
*/
			} catch(InterruptedException ignored) {
			}
		}
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		// main calls start, main dies, child thread continues
		c.start();
		// start() method calls run() method indirectly
		// t.run() when you want to run t's task on the current thread, 
		// and t.start() when you want to run t's task on thread t itself.
		c.run();
		// start first creates a new thread and then call run() method on new thread 
		// while if you call run() method directly than it will be called on same 
		// thread and no new thread will be created
	}
}
