public class indexOutOfBounds {
    public static void main(String[] args) {
        int a[] = {5,8,9,6};

        for(int n: a){
            System.out.println(n);
            //using enhanced for loop we can avoid this exception!!
        }
        // for (int i = 0; i <=4; i++) {
        //     System.out.println(a[i]);
        // }
        System.out.println("It is not going to be printed because of Array Index Out of Bounds Exception\n");
    }
}
