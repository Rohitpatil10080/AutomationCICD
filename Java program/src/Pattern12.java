
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		int lines=5;
		int starCount=1;
		int spaceCount=2;
		int mid=(lines+1)/2;
		for (int i=1; i<=lines; i++)
		{
		for(int k=1; k<=starCount; k++)
			{
				if(k==1||k==starCount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				for (int j=1; j<=spaceCount; j++)
				{
					System.out.print(" ");
				}
				for(int l=1; l<=starCount; l++)
				{
					if(l==1||l==starCount)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
				if(i<mid)
				{
					starCount++;
					spaceCount--;
				}
				else
				{
					starCount--;
					spaceCount++;
				}
			}
		System.out.println("program ended");
		}

	}

}
