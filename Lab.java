import java.util.Random;

public class Lab implements Runnable{

	Globals vars;
	Patient p;
	Random rn = new Random();
	
	public Lab(Globals vars)
	{
		this.vars=vars;
		(new Thread(this)).start();
		vars.setLab(this);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			 try {
			       System.out.println("labbbb");
			         this.wait();
			         System.out.println("labbbbstarting");
			         
			        } catch(InterruptedException e) {
			        }
			while(!vars.getTest().isEmpty()){
			
				int labTest = 10 + rn.nextInt(55 - 35 + 1);
				//get patients from Test queue
			  p=(Patient)vars.getTest().dequeue();
			 
			 
				  try {
				        
				         Thread.sleep(labTest*1000);
				         //put patients back to NEA queue to see the doctor again
				         vars.getNEA().enqueue(p);
				  
				  }
				  catch(InterruptedException e) {
			        }
			  }
			  
			  this.notify();
			} 

		}	
	}

