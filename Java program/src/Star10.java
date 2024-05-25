
public class Star10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		int lines=5;
		int starCount=5;
		
		for (int i=1; i<=lines; i++)
		{
			for(int j=1; j<=starCount; j++)
			{
				if (j==1||i==lines)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
							
			}
			System.out.println();
		}
        System.out.println("program ended");
	}

}
