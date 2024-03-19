public class enhancedForLoops {
    public static void main(String[] args) {
        int nums[][] = {
                        {3,9,7,5},
                        {4,5,9,3},
                        {7,1,5,8}
        };

        for(int a[] : nums){
            for(int b : a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }

        
    }
}
