
public class Pattern6 {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=2*n-1;j++)
			{
				if(j>=(n+1)-i && j<=(n-1)+i)
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
	}

}
