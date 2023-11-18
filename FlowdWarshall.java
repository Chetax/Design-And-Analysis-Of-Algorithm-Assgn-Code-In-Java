import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter How Many Node Does Have in Graph");
n=sc.nextInt();
System.out.println("Enter Node Values: ");
int[][] graph=new int[n][n];
 for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter Value For Node " + i + ", " + j + ": ");
                graph[i][j] = sc.nextInt();
            }
        }
 
 for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j]==-1)
                graph[i][j]=(int)1e2;
                
            }
        }

for(int k=0;k<n;k++)
for (int i = 0; i < n; i++) 
for (int j = 0; j < n; j++) 
graph[i][j] = Math.min(graph[i][j],graph[i][k]+graph[k][j]);
    
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j]==1e2)
                graph[i][j]=-1;
                
System.out.println("Shortes Path Between Al Node is : ");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) 
System.out.print(graph[i][j]+" ");
System.out.println("");

    
}
        
}

}
