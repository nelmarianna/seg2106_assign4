
public class Globals {

 Queue incoming;
 Queue CW;
 Queue NEA;
 boolean done = false;
 DoctorB doctorB;
 
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
 
  public void setDoctor(DoctorB d){
  doctorB =d;
 }
 public DoctorB getDoctor(){
  return doctorB;
 }
 
}
