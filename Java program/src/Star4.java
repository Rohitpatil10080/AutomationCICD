
public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		int lines=5;
	    int spaceCount=2;
	    int starCount=1;
		int mid=(lines+1)/2;
		
	for (int i=1; i<=lines; i++) {
		
		for (int j=1; j<=spaceCount; j++) {
			
			System.out.print(" ");
		}
		
		for (int k=1; k<=starCount; k++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		if (i<mid)
		{
			spaceCount--;
			starCount=starCount+2;
		}
		else
		{
			spaceCount++;
			starCount=starCount-2;
			
		}
	}
      System.out.println("program ended");
	}

}
