import java.util.*;
import java.lang.*;
class Second_Row_Sum
{
public static int secondRowSum(int matrix[][])
{
int sum = 0;
for(int j = 0; j < matrix[0].length; j++)
{
sum += matrix[1][j];
}
return sum;
}
public static void main(String []args)
{
int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
System.out.println(secondRowSum(matrix));
}
}