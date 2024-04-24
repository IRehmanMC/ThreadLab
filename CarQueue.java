import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class CarQueue {
	Random ranNum;
	Queue<Integer> queue;
	
	public CarQueue() {
		ranNum = new Random();
		queue = new ArrayDeque<Integer>();
		queue.add(ranNum.nextInt(4));
		queue.add(ranNum.nextInt(4));
		queue.add(ranNum.nextInt(4));
		queue.add(ranNum.nextInt(4));
		queue.add(ranNum.nextInt(4));
	}
	
	public int deleteQueue() {
		int randomInt;
		randomInt = queue.remove();
		return randomInt;
	
	}
	
	public void addToQueue() {
		class Run implements Runnable {
			public void run() {
				try {
					while (true) {
						queue.add(ranNum.nextInt(4));
						Thread.sleep(100);
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	
		Run runner = new Run();
		Thread runThread = new Thread(runner);
		runThread.start();
	}
}