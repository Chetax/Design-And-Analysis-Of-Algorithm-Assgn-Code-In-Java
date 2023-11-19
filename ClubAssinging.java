import java.util.*;

public class Main{
    public static int UpperBound(int[][] club,int n){
    for(int i=0;i<n-1;i++){
        //finding for every ellement
        int sum=club[i][i];
        for(int j=0;j<n-1;j++){
            if(i!=j){
            
                
            }
        }
    }
    }
    
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Value For n ");
    n=sc.nextInt();
    int[][] club=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            club[i][j]=sc.nextInt();
        }
    }
    //Find Lower Bound By getting Min for Every rows:
    int lb=0;
    for(int i=0;i<n;i++){
        int mini=Integer.INT_MAX;
        for(int j=0;j<n;j++){
            if(mini>club[i][j])
            mini=club[i][j];
        }
        lb+=mini;
    }
    //Find upper Bound:
    int up=UpperBound(club,n);
    
    System.out.print("Lower Bound "+lb+" Upper Bound "+up);
}
