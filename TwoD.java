public class TwoD {
    public static void main(String[] args) {
        int nums[][] = {
                {3,5,8,9},
                {8,9,7},
                {4,8,6,9}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
