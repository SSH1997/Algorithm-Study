import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int testCase = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCase; i++) {
            String[] score = sc.nextLine().split(" ");
            int num = Integer.parseInt(score[0]);

            int sum = 0;

            for (int j = 0; j < num; j++) {
                sum += Integer.parseInt(score[j + 1]);
            }

            float avg = ((float)sum / (float)num);

            int over = 0;

            for (int j = 0; j < num; j++) {
                if (avg < Float.parseFloat(score[j + 1])) {
                    over += 1;
                }
            }
            System.out.println(String.format("%.3f", ((float)over * 100) / (float)num) + "%");
        }
    }
}