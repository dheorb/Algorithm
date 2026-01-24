package n2920;
import java.util.Scanner;

public class Main
{
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[8];
		for(int i=0; i < 8; i++)
		{numbers[i]=sc.nextInt();}
		
		solution s = new solution(numbers);
		s.clearing();
		
		sc.close();
		}
		
		static class solution
		{
		private int[] numbers;
		public solution(int[] numbers)
		{
		this.numbers=numbers;
		}
		public void clearing()
		{
		int i=0;
		while(numbers[i]<numbers[i+1]&&numbers[i+1]<numbers[i+2]||numbers[i]>numbers[i+1]&&numbers[i+1]>numbers[i+2])
		{
		if(i==5&&numbers[i]==6)
		{   
		System.out.println("ascending");
		return;
		}
		else if(i==5&&numbers[i]==3)
		{
		System.out.println("decending");
		return;
		}
		i++;
		}
		System.out.println("mixed");
		}
		}
}