import java.util.*;
public class Main{
    
    public static int getMin(int[] distance,boolean[] visited){
        int minvartex=-1;
        int n=distance.length;
        for(int i=0;i<n;i++){
            if(!visited[i]&&(minvartex==-1||distance[i]<distance[minvartex]))
            minvartex=i;
        }
        return minvartex;
    }
    
    public static void dijekstra(int[][] adjcmat){
        int v=adjcmat.length;
        int[] distance=new int[v];
        boolean[] visited=new boolean[v];
    distance[0]=0;

    for(int i=1;i<v;i++){
     distance[i]=Integer.MAX_VALUE;
    }
        for(int i=0;i<v-1;i++)
        {
            int minVartic=getMin(distance,visited);
                  visited[minVartic]=true;
            for(int j=0;j<v;j++){
                if(!visited[j]&&adjcmat[minVartic][j]!=0&&distance[minVartic]!=Integer.MAX_VALUE){
                    int newdist=distance[minVartic]+adjcmat[minVartic][j];
                    if(newdist<distance[j])
                    distance[j]=newdist;
                                    }
            }
        }
            for(int i=0;i<v;i++){
   System.out.println(i+" "+distance[i]);
    }
    
    
        }
    
    
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int v;int e;
v=sc.nextInt();
e=sc.nextInt();
int [][] adjcmat=new int[v][v];
for(int i=0;i<e;i++){
   
    int v1=sc.nextInt();

    int v2=sc.nextInt();
   
    int w=sc.nextInt();
  adjcmat[v1][v2]=w;
  adjcmat[v2][v1]=w;
}

//call dijestra fnction 
dijekstra(adjcmat);
    }
}
// 5 7
// 0 1 4
// 0 2 8 
// 1 3 5
// 1 2 2 
// 2 3 5
// 2 4 9
// 3 4 4
