
public class Emergency{

  Globals vars;
  Queue q = new Queue();
  Nurse nOne, nTwo, nThree;
  
  public Emergency(Patient[] p){
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
