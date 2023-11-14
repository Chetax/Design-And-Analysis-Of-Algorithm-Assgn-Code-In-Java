import java.util.*;
// import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Jobs: ");
		int n=sc.nextInt();

	     int [] deadline=new int[n];
	     int [] profit=new int[n];

	  	System.out.println("Enter the profit : ");
	  	for(int i=0;i<n;i++){
	  	    profit[i]=sc.nextInt();
	  	}
	  	

	  	System.out.println("Enter the deadline : ");
	  	for(int i=0;i<n;i++){
	  	    deadline[i]=sc.nextInt();
	  	}
	  	

	  	
	  	//Creating Map 
	  	Map<Integer, Integer> m = new HashMap<>();
	  		for(int i=0;i<n;i++)
	  	{
	  	      m.put(profit[i], deadline[i]);
	  	}
	 
	 //sort according to profit
	 Arrays.sort(profit);
	 for(int i=0;i<n;i++){
	    int k=profit[i];
	    profit[i]=profit[n-1-i];
	    profit[n-1-i]=k;
	 }
	 
	 	 for(int i=0;i<n;i++){
	    System.out.println(profit[i]);
	 }
	 
	
for(Map.Entry<Integer,Integer>enter:m.entrySet()){
    System.out.println(enter.getKey()+" "+enter.getValue());
}
	    
	}
}
