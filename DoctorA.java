import java.util.Random;

public class DoctorA implements Runnable {
	
	Globals vars;
	Patient p;
	Random r = new Random();
	Random rn = new Random();
	Lab lab;
	
	public DoctorA(Globals vars)
	{
		this.vars=vars;
		
		(new Thread(this)).start();
		vars.setDoctorA(this);
		lab = vars.getLab();
	}

	@Override
	public void run() {

		synchronized(this){
			 try {
			       System.out.println("rgggged?");
			         this.wait();
				       System.out.println("rgggged333332?");

			        } catch(InterruptedException e) {
			        }
		
			while(!vars.getNEA().isEmpty()){
			
				int rendezvous = 10 + rn.nextInt(55 - 35 + 1);
				//get patients from NEA queue
			  p=(Patient)vars.getNEA().dequeue();
			  
			  //80% of them go to the lab for a test
			  if (r.nextInt(100) < 80)
			  {
				  try {
				        
				         Thread.sleep(rendezvous*1000);
				         //put patients into test queue
				         vars.getTest().enqueue(p);
				   	  System.out.println("Doctor sent NEA paitent to lab ...");
			       	} 
				  catch(InterruptedException e) {
			        }
			  }
			  else{
				  //send patient home
				  System.out.println("Doctor sent NEA paitent home ...");
			  }
			  
			  this.notify();
			} 

		}
		synchronized(lab)
	     {
	  	   lab.notify();
	   
	     }
	}
}
