import java.util.*;
class ArrayList
{
	private int size;
	private int osize;
	private int index;
	private int x[];
	
	ArrayList(int size)
	{
		this.size = size;
		osize = size;
		x = new int[size];
		index = -1;
	}
	
	public void add(int data)
	{
		if(index == size-1)
		{
			int temp[] = x;
			this.size = (int)(this.size*1.5);
			x = new int[this.size];
			
			for(int i=0;i<=index;i++)
			{
				x[i] = temp[i];
			}
		}
		index++;
		x[index] = data;
	}
	
	public int getIndex()
	{
		return index;	
	}
	
	public void delete(int data)
	{
		int pos = -1;
		for(int i=0;i<=index;i++)
		{
			if(x[i] == data)
			{
			pos = i;
			break;	
			}
		}
		
		if(pos == -1)
		{
		System.out.println("Number not found");	
		}
		
		else
		{
			for(int i=pos;i<=index;i++)
			{
			x[i] = x[i+1];	
			}
		index--;	
		}
	}
	
	public void deleteAll()
	{
		if(index == -1)
		{
			System.out.println("List is already empty");
		}
		
		else
		{
			System.out.println("Before deletion, no. of elements = " + (getIndex()+1));
			index = -1;
			//x = new int[osize];
			System.out.print("After deletion, no. of elements = " + (getIndex()+1)+" i.e ");
		}
	}
	
	public void traverse()
	{
		if(index == -1)
		{
			System.out.println("List is empty.");
		}			
		
		else
		{
			for(int i=0;i<=index;i++)
			{
				System.out.print(x[i]+" ");
			}
			System.out.println();
			System.out.println();
		}			
	}
	
}

public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		
		int n = sc.nextInt();
		ArrayList obj = new ArrayList(n);
		
		System.out.print("Enter the elements :");
		for(int i=1;i<=n;i++)
		{
			int num = sc.nextInt();
			obj.add(num);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Arraylist :");
		obj.traverse();
		
		System.out.print("Enter the element to insert :");
		int no = sc.nextInt();
		obj.add(no);
		
		System.out.println();
		System.out.println();
		System.out.print("After adding a element at end :");
		obj.traverse();
		
		
		System.out.print("Enter the element you want to delete :");
		int numb = sc.nextInt();
		obj.delete(numb);
		
		System.out.println();
		System.out.println();
		System.out.print("After deleting a element :");
		obj.traverse();

		System.out.println("Deleting all elements :");
		obj.deleteAll();
		obj.traverse();
	}
}