import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		int T;
        
		T=Integer.parseInt(sc.nextLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String[] str = sc.nextLine().split(" ");
            
            int max = Integer.parseInt(str[0]);
            
            for (int i = 1; i < str.length; i++) {
                int tmp = Integer.parseInt(str[i]);
                if (max < tmp) {
                    max = tmp;
                }
            }
            
            System.out.println("#" + test_case + " " + max);
        }
	}
}