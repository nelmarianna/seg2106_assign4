public class Emergency{

  Globals vars= new Globals();
  Queue q;
  Queue dummy;
  Nurse nOne;
  DoctorA docA;
  
  public Emergency(Patient[] p){
    
    q = new Queue();
    dummy = new Queue();
    
    for(int i=0; i< p.length; i++)
    {
   q.enqueue(p[i]);
    }
    
    vars.set(q);
    vars.setCW(dummy);
    vars.setNEA(dummy);
    
    nOne = new Nurse(vars);
   
    docA= new DoctorA(vars);

  }
}