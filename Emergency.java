
public class Emergency implements Runnable{

	
	//has all the queues here???
	public static void main(String [] args){
		
		//person comes into emergency room

		
		//three new threads one per nurse???
		(new Thread(new Emergency())).start();
		(new Thread(new Emergency())).start();
		(new Thread(new Emergency())).start();
		
		//nurse classifies CW or NEA
				//added to queue
				//doctor group a treats NEA queue
				//doctor group b treats CW queue
				//if NEA needs tests-> gets added to lab queue
	}


	public void run() {
	System.out.println("test");
		
	}
}
