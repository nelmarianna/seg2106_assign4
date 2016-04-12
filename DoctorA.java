import java.util.Random;

public class DoctorA implements Runnable {
	
	Globals vars;
	Patient p;
	Random r = new Random();
	
	public DoctorA(Globals vars)
	{
		this.vars=vars;
		(new Thread(this)).start();
		
	}

	@Override
	public void run() {

		synchronized(this){
		
			while(!vars.getNEA().isEmpty()){
			
				//get patients from NEA queue
			  p=(Patient)vars.getNEA().dequeue();
			
			  //80% of them go to the lab for a test
			  if (r.nextInt(100) < 80)
			  {
				  //put patients into test queue
				  vars.getTest().enqueue(p);
			  }
			  else{
				  //send patient home
				  
			  }
			  
			  this.notify();
			} 
		}	
	}
}
