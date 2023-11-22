/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[][] mat=new int[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    mat[i][j]=sc.nextInt();
    }
}

        
        Map<Integer,Integer>m=new HashMap<>();
        for(int x=0;x<n;x++) {
            int miniEle=1000;
            for(int y=0;y<n;y++) {
                int sum= mat[x][y];
                for(int i=0;i<n;i++) {
                    if(i==y) continue;
                    int mini= 200;
                    for(int j=0;j<n;j++) {
                        
                        if(j==x) continue;
                        mini= Math.min(mini,mat[j][i]);
                    }
                    sum+=mini;
                }
              int pre=m.get(y);
              if(pre==0)
              {
                  if(miniEle>sum){
                      assign=y;
                  }
                  miniEle=Math.min(miniEle,sum);
                  System.out.println(assign);
              }
              
            }
            System.out.println("Mini For i "+miniEle);
            m.put(x,miniEle);
        }
        for(int i=0;i<n;i++){
          System.out.println(i+1+" "+m.get(i)); 
        }
	
	}	
}
