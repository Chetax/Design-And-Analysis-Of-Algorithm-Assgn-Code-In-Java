import java.util.*;
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
	  	int maxi=-1;
	  	for(int i=0;i<n;i++){
	  	    deadline[i]=sc.nextInt();
	  	  if(maxi<deadline[i])
	  	  maxi=deadline[i];
	  
	  	}
	  	

	  	
	  	//Creating Map 
	  	Map<Integer, Integer> m = new HashMap<>();
	  		for(int i=0;i<n;i++)
	  	{
	  	      m.put(profit[i], deadline[i]);
	  	}
	 
	 //sort according to profit
	 Arrays.sort(profit);
	 for(int i=0;i<n/2;i++){
	    int k=profit[i];
	    profit[i]=profit[n-1-i];
	    profit[n-1-i]=k;
	 }
	 
	int[] ans=new int[maxi]; 
	System.out.println(m.get(profit[0]));
	for(int i=0;i<n;i++){
	   int deadl=m.get(profit[i]);
	   if(ans[deadl-1]==0){
	       ans[deadl-1]=profit[i];
	   }
	   else {
	       for(int j=deadl-1;j>=0;j--){
	           	   if(ans[j]==0){
	       ans[j]=profit[i];
	   }
	       }
	   }
	}
	int sum=0;
	for(int i=0;i<maxi;i++)
	sum+=ans[i];
	System.out.println("Profit Is "+ sum);
	
	
	}
}
