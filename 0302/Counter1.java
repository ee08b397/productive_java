class Thread {
	public Thread (Runnable r) {
		this.r = r;
	}
	public void run() {
		r.run();
	}
}

// prefer implements, only one parent for extends
public class Counter1 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; ++i) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ignored) {
			}
		}
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t = new Thread(c);
		c.start(t);
	}
}
