import java.util.Random;

public class DoctorA implements Runnable {
	
	Globals vars;
	Patient p;
	Random r, rn = new Random();
	
	public DoctorA(Globals vars)
	{
		this.vars=vars;
		(new Thread(this)).start();
		
	}

	@Override
	public void run() {

		synchronized(this){
		
			while(!vars.getNEA().isEmpty()){
			
				int rendezvous = 10 + rn.nextInt(55 - 35 + 1);
				//get patients from NEA queue
			  p=(Patient)vars.getNEA().dequeue();
			  long startTime = System.currentTimeMillis();
			   System.out.println("Doctor is busy..");
			  
			  //80% of them go to the lab for a test
			  if (r.nextInt(100) < 80)
			  {
				  try {
				        
				         Thread.sleep(rendezvous*1000);
				         //put patients into test queue
				         vars.getTest().enqueue(p);
				  
				         long timea = System.currentTimeMillis() - startTime;
				         System.out.println("Doctor: Rendezvous time nea " + timea + " ms");
			       	} 
				  catch(InterruptedException e) {
			        }
			  }
			  else{
				  //send patient home
				  
			  }
			  
			  this.notify();
			} 

		}	
	}
}
