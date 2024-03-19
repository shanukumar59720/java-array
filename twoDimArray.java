import java.util.Scanner;

public class twoDimArray {
    public static void main(String[] args) {
        int num[][] = new int[3][2];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        //getting the user input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        //display the information
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
