public class Emergency{

  Globals vars= new Globals();
  Queue q;
  Queue dummy;

  Nurse nOne, nTwo, nThree;
  DoctorB doc;
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


    doc = new DoctorB(vars);
    nOne = new Nurse(vars);
     docA= new DoctorA(vars);
    vars.done = true;
//   nTwo = new Nurse(vars);
  // nThree = new Nurse(vars);

  }

  }
