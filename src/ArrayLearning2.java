//package default
public class ArrayLearning2 
{

	public static void main(String[] args) 
	{
		sum (new int[] {10,20,100,40});
		
	}
	public static void sum(int[] x){
	
	int total = 0;
	
	for (int x1 : x) {
	
		total = total+x1;
	
	}
	
	System.out.println("The sum:"+total);
	
	}

}
