import java.util.Random;

public class Lab implements Runnable{

	Globals vars;
	Patient p;
	Random r = new Random();
	
	public Lab(Globals vars)
	{
		this.vars=vars;
		(new Thread(this)).start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			
			while(!vars.getTest().isEmpty()){
			
				//get patients from Ntest queue
			  p=(Patient)vars.getTest().dequeue();
			
			  //put patients into NEA queue to see doctor again
			  vars.getNEA().enqueue(p);
			  
			  this.notify();
			} 
		}	
	}
}
