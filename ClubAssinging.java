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





import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;
public class assg6 {
    static int N;
    static int[][] costMatrix;

    static class AssignmentNode {
        int student;
        int club;
        int cost;
        AssignmentNode parent;

        AssignmentNode(int student, int club, int cost, AssignmentNode parent) {
            this.student = student;
            this.club = club;
            this.cost = cost;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
        try {
            takeInput();
            branchAndBound();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void takeInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of students and clubs (N): ");
            N = scanner.nextInt();

            if (N <= 0) {
                throw new IllegalArgumentException("Number of students and clubs should be greater than 0.");
            }

            costMatrix = new int[N][N];

            System.out.println("Enter the cost matrix:");

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("Cost for student " + i + " and club " + j + ": ");
                    costMatrix[i][j] = scanner.nextInt();
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static void branchAndBound() {
        AssignmentNode root = new AssignmentNode(-1, -1, 0, null);
        int minCost = Integer.MAX_VALUE;
        AssignmentNode minCostNode = null;

        for (int i = 0; i < N; i++) {
            AssignmentNode child = new AssignmentNode(0, i, costMatrix[0][i], root);
            minCostNode = branchAndBoundUtil(child, 1, minCost, minCostNode);
        }

        printSolution(minCostNode);
    }

    private static AssignmentNode branchAndBoundUtil(AssignmentNode node, int level, int minCost, AssignmentNode minCostNode) {
        if (level == N) {
            if (node.cost < minCost) {
                minCost = node.cost;
                minCostNode = node;
            }
            return minCostNode;
        }

        for (int i = 0; i < N; i++) {
            if (!isAssigned(node, i)) {
                AssignmentNode child = new AssignmentNode(level, i, node.cost + costMatrix[level][i], node);

                if (child.cost < minCost) {
                    minCostNode = branchAndBoundUtil(child, level + 1, minCost, minCostNode);
                }
            }
        }

        return minCostNode;
    }

    private static boolean isAssigned(AssignmentNode node, int club) {
        while (node != null) {
            if (node.club == club) {
                return true;
            }
            node = node.parent;
        }
        return false;
    }

    private static void printSolution(AssignmentNode minCostNode) {
        if (minCostNode == null) {
            System.out.println("No valid assignment found.");
            return;
        }

        System.out.println("Optimal Cost: " + minCostNode.cost);
        System.out.println("Assignment:");

        for (int i = N - 1; i >= 0; i--) {
            System.out.println("Assign Student " + minCostNode.student + " to Club " + minCostNode.club);
            minCostNode = minCostNode.parent;
        }
    }
}
