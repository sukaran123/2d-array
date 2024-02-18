import java.util.*;
import java.lang.*;
class search_sorted_array
{
public static boolean staircaseSearch(int matrix[][], int key)
{
// int row = 0; // from top-left
int col = 0; // from bootom-right
// int col = matrix[0].length - 1; // from top-left
int row = matrix.length - 1; // from bottom-right
// while(row < matrix.length && col >= 0) // from top-left
while(col < matrix[0].length && row >= 0)
{
if(matrix[row][col] == key)
{
System.out.println("found key at (" + row + "," + col + ")");
return true;
}
else if(key < matrix[row][col])
{
// col--; // from top-left
row--; // from bottom-right
}
else
{
// row++; // from top-left
col++; // from bottom-right
}
}
System.out.println("key not found");
return false;
}
public static void main(String []args)
{
int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
int key = 33;
staircaseSearch(matrix, key);
}
}