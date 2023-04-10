import java.util.*;
public class ArrayExample {
	private static Random r = null;
	public static void  fillArray(int[] a)
	{
		r = new Random();
		for (int i = 0; i < a.length; i++)
			a[i] = r.nextInt(101); //0 to 100
		Arrays.sort(a);  //radom numbers with sorting 
		//Arrays.sort(a, 0, 3);
		System.out.println(Arrays.toString(a));
	}
	public static void display(char[] v) {
		
		for (int i = 0; i < v.length; i++)
			System.out.print(Character.toUpperCase(v[i]) + ",");
			System.out.println();
		}
		//sequential search
		public static int searchArray(int[] a, int target)
		{
		  for (int i = 0; i < a.length; i++)
		  {
			  if (a[i] == target)
				  return i;
		}
		return -1;
}
		public static double calculateAverage(int[] a)
		{
			int sum =0;
			for(int i = 0; i < a.length; i++)
			{
				sum = sum + a[i];
			}
			return (double)sum / a.length;
		}
		//creating object for static u need class name
		public static void shuffle(Card[] deck) 
		{
			Card temp;
			for(int i = 0; i < deck.length; i++)
			{
			int x = r.nextInt(52);
			//swap(deck[i}, deck[i];
			temp = deck[i];
			deck[i] = deck[x];
			deck[x] = temp;
		}
	}
		//main program
		public static void main(String[] args) {
			Card[] deck = new Card[52];
			for (int i = 0; i < deck.length; i++)
			{
				deck[i] = new Card();
			}
			Student[] cs111 = new Student[10];
			//cs111[0] = new Student();
			for (int i = 0; i < cs111.length; i++)
			{
				cs111[i] = new Student();
			}
			//display the 5th student
			System.out.println(cs111[4]);
			
			int loc =0;
			int[] grades = new int[10];
				char[] vowel = {'a', 'e', 'i', 'o', 'u'};
				String[] days =	{"Mon", "Tue", "Wed", "Thu", "Fri"};
                ArrayExample.display(vowel);
                ArrayExample.fillArray(grades);
                loc = Arrays.binarySearch(grades, 20);
                if(loc == -1)
            		System.out.println("Not found...");
                else 
                	System.out.println("Found at location.... " + loc);
                
                loc = ArrayExample.searchArray(grades, 20) ;
                if(loc == -1)
                		System.out.println("Not found");
                else 
                	System.out.println("Found at location " + loc);
                System.out.println("Average is "+ ArrayExample.calculateAverage(grades));
                
			
		
		}

	}


