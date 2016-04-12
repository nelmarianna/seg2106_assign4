import java.util.Random;

public class Nurse implements Runnable{

 Globals vars;
 Patient p;
 Random r = new Random();
 
 Nurse()
 {
  (new Thread(this)).start();
  
 }

 
 public void run() {
  try {
   
   while(!vars.get().isEmpty()){
   
   Thread.sleep(250);
     p=(Patient)vars.get().dequeue();
   
     if (r.nextInt(100) < 15)
     {
       vars.getNEA().enqueue(p);
     }
     else
     {
      vars.getCW().enqueue(p);
     }
     this.notifyAll();
   }
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
 }

  
 }

