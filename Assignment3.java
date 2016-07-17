import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		int n,m;
		Scanner s=new Scanner(System.in);
		char ans;
		
		do
		{
			System.out.println("***** GENERATE A PATTERN *****");
			System.out.print("Enter n: ");
			n=s.nextInt();
			m=(2*n)-1;
		
			if(n>1)
			{
				for (int i=1;i<=m;i++)
				{
					for(int j=1;j<=m;j++)
					{
						if(i!=j && j>i)
							System.out.print("    ");
						else if(i+j>m+1)
							System.out.print("    ");
						else
							System.out.print(j+"   ");
					}
					System.out.println("");
				}
			}
			else
				System.out.println("n can't be less than 1. Please try again.");
			System.out.print("\nDo you wish to retry (y/n): ");
			ans=s.next().toLowerCase().charAt(0);
		} while (ans=='y');
		s.close();
	}

}
