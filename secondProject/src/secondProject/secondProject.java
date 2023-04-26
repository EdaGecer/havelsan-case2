package secondProject;

import java.util.Scanner;

public class secondProject {
	public static void main(String[] args) 
	{
		System.out.println("Enter array matris:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int[] A = new int[n];
         int result = 0;
         String resultSet = "";

         for (int i = 0; i < n; i++) {
	           A[i]= scanner.nextInt();
	        }
         
         for (int i = 1;  i < n; i++)
         {
             for (int j = i + 1; j <= n; j++)
             {
                 if (Math.abs(A[i - 1] - A[j - 1]) == (Math.pow(j, 2) + Math.pow(i, 2)))
                 {
                     result++;
                     resultSet += "(" +i+ ","+j+")";
                 }
             }
         }

         System.out.println(result);
         System.out.println(resultSet);

	}
}
