
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("programe started");


        int lines=5;
        int starCount=1;
        int spaceCount=4;

        for (int i=1; i<=lines; i++)
        {
            for(int j=1; j<=spaceCount; j++) {
                System.out.println("");
            }
                for (int k = 1; k <= starCount; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
                spaceCount--;
                starCount = starCount + 2;
            }
            System.out.println("program ended");
        }
}



