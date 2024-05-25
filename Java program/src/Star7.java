
public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("program started");

      int lines=5;
      int starCount=5;
      int spaceCount=0;
      int mid=(lines+1)/2;
      
      for (int i=1; i<=lines; i++)
      {
    	  for (int j=1; j<=spaceCount; j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for (int k=1; k<=starCount; k++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
    	  if (i<mid)
    	  {
    		  
    		starCount=starCount-2;
    		spaceCount++;
    		  
    	  }
    	  else
    	  {
    		  starCount=starCount+2;
    		  spaceCount--;
    	  }
    		  
      }
      System.out.println("program ended");
	}

}
