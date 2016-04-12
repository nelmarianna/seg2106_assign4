import java.util.Random;

public class Nurse implements Runnable{

<<<<<<< HEAD
	
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
=======
 Globals vars;
 Patient p;
 Random r = new Random();
 
 Nurse(Globals vars)
 {
   this.vars=vars;
  (new Thread(this)).start();
  
 }

 
 public void run() {
  try {
     synchronized(this){
       if (vars.done==true)
         System.out.println(vars.get().isEmpty())
            this.wait();      
     }
   while(!vars.get().isEmpty()){
   System.out.println(vars.get().isEmpty());

     p=(Patient)vars.get().dequeue();
   
     if (r.nextInt(100) < 15)
     {
       vars.getNEA().enqueue(p);
     }
     else
     {
      vars.getCW().enqueue(p);
     }
     try{
     synchronized(this){
       this.notify();
     }}
     catch (Exception e) {
        // ...
    }     
   }
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }

  
 }

>>>>>>> abf03943adda38c1429778466cc0da2c54686f22
