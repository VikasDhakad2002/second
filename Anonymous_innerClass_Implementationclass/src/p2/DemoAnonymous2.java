package p2;
import p1.IComparable;
import java.util.Scanner;

public class DemoAnonymous2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value-1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Value-2:");
		int v2 = s.nextInt();
		System.out.println("****Choice****");
		System.out.println("\t1.GreaterValue"
				             +"\n\t2.SmallerValue");
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			//Greatervalue class as Anonymous
			IComparable ob1 = new IComparable()
			{
				public int compareTo(int x,int y)
				{
					if(x>y)return x;
					else return y;
				}
			};
			int res1 = ob1.compareTo(v1, v2);
			System.out.println("GreaterValue:"+res1);
			break;
		
		case 2:
			//SmallerValue class as Anonymous
			IComparable ob2 = new IComparable()
			{
				public int compareTo(int x,int y)
				{
					if(x<y)return x;
					else return y;
				}
			};
			int res2=ob2.compareTo(v1,v2);
			System.out.println("Smaller Value:"+res2);
			break;
		default:
			System.out.println("Invalid Choice..");
			
		}
		s.close();
	}

}
