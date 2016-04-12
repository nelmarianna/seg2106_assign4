
public class Emergency{

  Globals vars;
  Queue q = new Queue();
  Nurse nOne, nTwo, nThree;
  
  public Emergency(Patient p){
    q.enqueue(p);
  }
  public void Setting(){
	  vars.set(q);
  }
  
  public void Categorize(){
	  nOne = new Nurse();
	  nTwo = new Nurse();
	  nThree = new Nurse();
  }
 

}
