import java.util.*;
public class Main{
    public static void getAllPoition(int[][] chess,int x,int c,int n,int[] count) {
        if(x>=n||c>=n||x<0||c<0||chess[x][c]==1) 
        return;
        
    chess[x][c]=1;
    count[0]++;
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++)
        System.out.print(chess[i][j]+" ");
        System.out.println("");
}
        System.out.println("");

    getAllPoition(chess,x+1,c-2,n,count);
    getAllPoition(chess,x+1,c+2,n,count);
    getAllPoition(chess,x-1,c+2,n,count);
    getAllPoition(chess,x-1,c-2,n,count);
    getAllPoition(chess,x+2,c-1,n,count);
    getAllPoition(chess,x+2,c+1,n,count);
    getAllPoition(chess,x-2,c+1,n,count);
    getAllPoition(chess,x-2,c-1,n,count);
    return;
        
    }

  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Value Of N");
    int n=sc.nextInt();
    int[][] chess=new int[n][n];
    System.out.print("Enter The Starting Position (x,y) :- ");
    int x=sc.nextInt();
    int y=sc.nextInt();int[] count={0};
    getAllPoition(chess,x,y,n,count);
    int flag=0;
     for(int i=0;i<n;i++){
    for(int j=0;j<n;j++)
    if(chess[i][j]==0){
        System.out.println("Not Able to Move to visit all chess cell");
    flag++;
        break;
    }
}
if(flag==0){
    System.out.print("From Starting Position Knight Can Move Every Position with number of jump : "+count);
    
}

  } 
}
