# Design and Analysis Subject Assignments Repository

This repository contains my assignments for the Design and Analysis subject, implemented in Java programming language.

## Assignments Overview

### Assignment 1: [Long Number Multiplication]

- Description: [Divesde And Conquor]
- File(s): `LongNumberMultiplication.java`, `helperFunctions.java`


### Assignment 2: [Job Sheduling]

- Description: [Greedy Algo Application]
- File(s): `JobShedulling.java`, `helperFunctions.java`

  
### Assignment 3: [Flowd Warshall]

- Description: [Shortest Disstance Form every source node  to every  other Node in Graph]
- File(s): `FlowdWarshall.java`, `helperFunctions.java`


### Assignment 4: [Dijekstra]

- Description: [Shortest Disstance Form One Source to every Node in Graph]
- File(s): `Dijekstra.java.java`, `helperFunctions.java`

  
### Assignment 5: [KnighRidder Problem]

- Description: [Backtraking Application]
- File(s): `knighridderProblem.java.java`, `helperFunctions.java`


### Assignment 6: [Club Assinging Problem]

- Description: [Branch and bound Application]
- Steps: Assumin we hava 4*4 matrix
  1.First Find Min Of Every Row And Caculate Sum is know as lower bound
  2.Find Job Allocation for A(i.e 1st row ) By following Methos:
     - A1= add first element from 0,0+ min element from every column  except first column
     - A2=add first element from 0,1 + min element from every column  except second column
     - similary find for A3 and A4
       From Thee With Minimum Column We Will Assign Job For A to min(A1,A2,A3,A4);
       Let Us Suppose We Assign Job For A to A2 then leave column 2;
  3.Find Job Allocation for B(i.e 2nd row ) By following Methos:
     - B1= add first element from 1,0+ min element from every column  except first column
     - B2=Not Taking Because We Assing Job To A;
     - B3=add first element from 1,2 + min element from every column  except Third column
     - B4=add first element from 1,3 + min element from every column  except Fourth column
    
       From Thee With Minimum Column We Will Assign Job For B to min(B1,B3,B4);
       Let Us Suppose We Assign Club For B to B1 then leave column 1;
       
  4.Find Job Allocation for C and D As We Are Left With 2 Column We Can Do It By Comparision Also, By following Methos:
    as a=2 b=1 c=3 d=4 or a=2 b=1 c=4 d=3
with minimum we will assing club accordingly.
Upper bound =min(a=2 b=1 c=3 d=4, a=2 b=1 c=4 d=3)
Thanks

- File(s): `ClubAssinging.java`, `helperFunctions.java`

### Assignment 7: [Mini Project]

- Description: [Greddy Application base coin collection game]
- Repo Link : [https://github.com/Chetax/Greddy-Aproach-And-Coin-Collection]


## Technologies Used

- Java programming language



