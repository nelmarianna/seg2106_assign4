
public class Globals {

 Queue incoming;
 Queue CW;
 Queue NEA;
 Queue test;
 boolean done = false;
 DoctorB doctorB;
 DoctorA doctorA;
 
 public void set(Queue incoming){
  this.incoming=incoming;
 }
 public Queue get(){
  return incoming;
  
 }
 public void setCW(Queue CW){
  this.CW=CW;
 }
 public Queue getCW(){
  return CW;
  
 }
 public void setNEA(Queue NEA){
  this.NEA=NEA;
 }
 public Queue getNEA(){
  return NEA;
  
 }
 
  public void setDoctorB(DoctorB d){
  doctorB =d;
 }
 public DoctorB getDoctorB(){
  return doctorB;
 }
 
 public void setTest(Queue test){
  this.test=test;
 }
 public Queue getTest(){
  return test;
 }
 
 public void setDoctorA(DoctorA d){
 doctorA =d;
}
public DoctorA getDoctorA(){
 return doctorA;
}
}

