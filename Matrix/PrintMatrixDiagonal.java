package Matrix;

public class PrintMatrixDiagonal
{
    public static void main(String args[])
    {
        int i, j, k, n=3, m=3;
//initializing a matrix    
        int arr[][] = {{3, 7, 9}, {2, 1, 5}, {8, 6, 4}};
        System.out.println("Matrix elements in diagonal form are: ");
//for loop for diagonals that starts from the first elements of the rows  
//variable k denotes the starting of the element in rows  
//loop execute till m-1 i.e. if matrix is m*n (3*3) the loop executes from k=0 to 2  
        for(k=0; k<=m-1; k++)
        {
//the first element of the diagonal starts form the k-th row  
            i=k;
//the first element of the diagonal starts form the first column  
            j=0;
//every diagonal end in first row  
            while(i>=0)
            {
//prints the elements  
                System.out.print(arr[i][j]+"\t");
//decrement i by 1  
                i=i-1;
//increment j by 1  
                j=j+1;
            }
        }
//for loop for diagonals that starts from the last elements of the columns  
//every element ends in last column so will execute loop up to n-1 (where n is the number of columns)  
//here, k=1 because avoid to print a diagonal twice  
        for(k=1; k<=n-1; k++)
        {
//here every diagonal starts from the last element of the last row  
            i=m-1;
//k iterate the starting element of each diagonal so; we have started j by k i.e. 1   
            j=k;
            while(j<=n-1)
            {
//prints the element   
                System.out.print(arr[i][j]+"\t");
//getting the next element in the diagonal   
                i=i-1;
                j=j+1;
            }
        }
    }
}  