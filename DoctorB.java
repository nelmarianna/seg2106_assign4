import java.util.Random;

public class DoctorB implements Runnable{


 Globals vars;
 Patient p;
 Random rn = new Random();

 
 int inOffice = 5 + rn.nextInt(45 - 5 + 1);
 
 DoctorB(Globals vars)
 {
   this.vars=vars;
  (new Thread(this)).start();
  
    vars.setDoctorB(this);
 }

 
 
 public void run() {
  
   synchronized(this){
   
     //change this somehow so that 
     try {
       System.out.println("reached?");
         this.wait();
         System.out.println("merpoooo");
        } catch(InterruptedException e) {
        }
   while(!vars.getCW().isEmpty()){
     
      
  
     //this needs to wait for nurse to notify.. google
     p=(Patient)vars.getCW().dequeue();
    try {
          Thread.sleep(inOffice*10);
          System.out.println("Doctor sent CW paitent home in ...");
        } catch(InterruptedException e) {
        }
       
     }
     this.notify();
   }
   
   }
   
  
 }
