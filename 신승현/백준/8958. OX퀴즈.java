import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T;

        T=Integer.parseInt(sc.nextLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String[] str = sc.nextLine().split("");
            int sum = 0;
            int tmp = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("O")) {
                    tmp += 1;
                } else {
                    tmp = 0;
                }

                sum += tmp;
            }

            System.out.println(sum);
        }
    }
}