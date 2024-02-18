import java.util.*;
class smallest_and_largest_2D_Array
{
public static int smallest(int matrix[][])
{
int smallest = Integer.MAX_VALUE;
for(int i = 0; i < matrix.length; i++)
{
for(int j = 0; j < matrix[0].length; j++)
{
if(matrix[i][j] < smallest)
{
smallest = matrix[i][j];
}
}
}
return smallest;
}
public static int largest(int matrix[][])
{
int largest = Integer.MIN_VALUE;
for(int i = 0; i < matrix.length; i++)
{
for(int j = 0; j < matrix[0].length; j++)
{
if(matrix[i][j] > largest)
{
largest = matrix[i][j];
}
}
}
return largest;
}
public static void main(String []args)
{
int matrix[][] = new int[3][3];
int n = matrix.length;
int m = matrix[0].length;
Scanner sc = new Scanner(System.in);
for(int i = 0; i < n; i++)
{
for(int j = 0; j < m; j++)
{
matrix[i][j] = sc.nextInt();
}
}
for(int i = 0; i < n; i++)
{
for(int j = 0; j < m; j++)
{
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
System.out.println(smallest(matrix));
System.out.print(largest(matrix));
}
}