import java.util.Random;

public class Lab implements Runnable{

	Globals vars;
	Patient p;
	Random r, rn = new Random();
	
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
			
				int labTest = 10 + rn.nextInt(55 - 35 + 1);
				//get patients from Test queue
			  p=(Patient)vars.getTest().dequeue();
			  long startTime = System.currentTimeMillis();
			   System.out.println("Lab is busy..");
			  
			  //80% of them go to the lab for a test
			  if (r.nextInt(100) < 80)
			  {
				  try {
				        
				         Thread.sleep(labTest*1000);
				         //put patients back to NEA queue to see the doctor again
				         vars.getNEA().enqueue(p);
				  
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
