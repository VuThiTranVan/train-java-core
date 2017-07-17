package framgia.co.train.java.synchronizedThread;

public class Priority extends Thread {

	int num;

	public Priority(int num) {
		this.num = num;
	}

	public void run() {
		for (int count = 0; count <= num; count++) {
			System.out.println("Count = " + count);
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("Its priority was " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Its priority now is :" + Thread.currentThread().getPriority());
	}

	public static void main(String args[]) {
		for (int ctr = 0; ctr < 2; ctr++) {
			Priority Objprior = new Priority(5);
			Objprior.start();
			Objprior.setName("Thread " + (ctr + 1));
		}
	}

}
