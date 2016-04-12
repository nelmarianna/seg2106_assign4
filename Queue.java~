class Queue{
  private int[] que;
  private int nextIn,
    nextOut,
    filled,
    quSize;
  
  public Queue(int size){
    que = new int (size);
    filled=0;
    nextIn=1;
    nextOut=1;
    queSize=size;
  } ///end of queue constructor
  
  public synchronized void deposit (int item){
    try{
      while (filled == queSize)
        wait();
      que[nextIn] = item;
      nextIn = (nextiN % queSize) + 1;
      filled++;
      notify();
    }
    catch(InterruptedException e){}
  } //end of deposit
  
  public synchronized int fetch(){
    int item=0;
    try{
      while (filled==0)
        wait();
      item = que[nextOut];
      nextOut = (nextOut % queSize) + 1;
      filled--;
      notify();
      }
catch(InterruptedException e){}
return item;
}//end of fetch

}//end of class

  