public class Main{
    public long  fact(long  n){
      if(n==1)
      {
	  return 1;
	  }
	  return n*fact(n-1);
	}
	public static void main(String args[])
	{
	  Main fact=new Main();
	  
	  System.out.println(fact.fact(20));
	
	}
} 