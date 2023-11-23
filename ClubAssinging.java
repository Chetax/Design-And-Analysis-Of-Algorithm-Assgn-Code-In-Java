import java.util.*;
public class clubassin {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int mat[][]=new int[n][n];
 for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    mat[i][j]=sc.nextInt();
    }
 }


int assign[]=new int[n];
 for(int row=0;row<n;row++){
     int ans[]=new int[n];
    for(int col=0;col<n;col++){
        int sum=mat[row][col];
        for(int i=0;i<n;i++){
            int mini=100;
            if(i==col) continue;
            for(int j=0;j<n;j++){
                if(j==row) continue;
                if(ans[i]==1000)
               mini=Math.min(mini,mat[j][i]);
            }
          sum+=mini;
        }
         System.err.println(sum);
ans[col]=sum;
        }
        for(int i=0;i<n;i++)
        System.out.print(" ans: "+ans[i]+" ");
        System.err.println("");
    }
}
    
}
// 4
// 9 2 7 8
// 6 4 3 7
// 5 8 1 8
// 7 5 2 4
