import java.util.Random;
public class Main {

  public static void main(String args[]) {
  
  Patient [] p =new Patient[10];
  
  for(int i=0; i< p.length; i++)
  {
	  p[i]= new Patient();
  }
  
   Emergency e = new Emergency(p);

  }
}
