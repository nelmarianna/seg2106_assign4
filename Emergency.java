
public class Emergency{

  Globals vars= new Globals();
  Queue q;
  Queue dummy;
  Nurse nOne, nTwo, nThree;
  
  public Emergency(Patient[] p){
    
    q = new Queue();
    
    for(int i=0; i< p.length; i++)
    {
   q.enqueue(p[i]);
    }
    
    vars.set(q);
    
    nOne = new Nurse();
   nTwo = new Nurse();
   nThree = new Nurse();
  }
 

}
