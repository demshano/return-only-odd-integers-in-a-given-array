import java.util.*;
public class Orange
{
	
	public static void main(String []args)
	{
		Orange obj = new Orange();
		
		/* Scanner scan  = new Scanner(System.in);
		
		int size;
		System.out.println("size of array: ");
		size=scan.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("enter array elements: ");
		
		for(int i=0;i<size;i++)
		{
			
			array[i]=scan.nextInt();
		}
		
		for(int i: array)
		{
			System.out.print(i+" - ");
		}
		int odd_length=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
			{
				odd_length++;
			}
		}
		
		System.out.println();
		System.out.print(odd_length);
		
		int[] odd=new int[odd_length];
		
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			
			
			if(array[i]%2==1)
			{
				odd[index]=array[i];
				index++;
			}
		}
		
		System.out.println();
		for(int i: odd)
		{
			System.out.print(i+" - ");
		}
		 */
		 
		 obj.input();
	}
	
	
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		
		int size;
		System.out.println("size of array: ");
		size=scan.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("enter array elements: ");
		
		for(int i=0;i<size;i++)
		{
			
			array[i]=scan.nextInt();
		}
		
		odd_op(array);
		
	}
	
	public void odd_op(int[] array)
	{
		
		int odd_length=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==1)
			{
				odd_length++;
			}
		}
		
		System.out.println();
		System.out.print(odd_length);
		
		int[] odd=new int[odd_length];
		
		int index=0;
		for(int i=0;i<array.length;i++)
		{
			
			
			if(array[i]%2==1)
			{
				odd[index]=array[i];
				index++;
			}
		}
		
		System.out.println();
		for(int i: odd)
		{
			System.out.print(i+" - ");
		}
	}
}






    

