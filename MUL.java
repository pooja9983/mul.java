//java program to multiply two square matrices.
import java .io.*;
class MUL {
// function to print matrix
static void printMatrix(int M[][], int rowSize,int colSize)
{
for (int i=0;i<rowSize;i++){
for (int j=0;j<colSize;j++)
system.out.print(M[i][j] +" ");
system.out.println();
} 
} 
static void multiplymatrix(
int row1,int col1,int A[][],  
 int row2,int col2,int B[][])
{
int i ,j,k;
System.out.println(" \nMatrix A:");
PrintMatrix(A,row1,col1);
System.out.println(" \nMatrix B:");
PrintMatrix(A,row2,col2);
// check if multiplication is possible
if(row2!=col){
System.out.println(" \nMultiplication not possible"); 
return;
}
int c[][]=new int [row1][col2];
for ( i=0;i<row1;i++){
for ( j=0;j<col2;j++){
for (k=0;k<row2;k++)
c[i][j]+=A[i][k]*B[k][j];
}
}
//print the result
System.out.println("\nResultant Matrix:");
printMatrix(C,row1,col2);
public static void main(String[]args)
{
int row1=4,col1=3,row2=3,col2=4;
int A[][]={{1,1,1},
           {2,2,2},
           {3,3,3},
           {4,4,4}};
int B[][]={{1,1,1,1},
           {2,2,2,2},
           {3,3,3,3}}; 
multiplyMatrix(row1,col1,A,row2,col2,B);
}
}





