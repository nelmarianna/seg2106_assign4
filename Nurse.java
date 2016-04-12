import java.util.Random;

public class Nurse implements Runnable{
	Globals vars;
	Patient p;
	Random r = new Random();
	
	public Nurse(Globals vars)
	{
		this.vars=vars;
		(new Thread(this)).start();
		
	}

	
	public void run() {
		
			synchronized(this){
			
			while(!vars.get().isEmpty()){
			
			System.out.print("xxx");
			  p=(Patient)vars.get().dequeue();
			
			  if (r.nextInt(100) < 15)
			  {
			    vars.getNEA().enqueue(p);
			  }
			  else
			  {
				  vars.getCW().enqueue(p);
			  }
			  this.notify();
			}
//			  
			}
		 
		
	}
}
