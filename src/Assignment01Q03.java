public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int prev1 = 1;
        int prev2 = 1;
        int numOdd = 0;
        System.out.println("The first " + x + " Fibonacci numbers are:");

        for (int i = 0 ; i < x ; i++){
            System.out.print(prev1 + " ");
            if (prev1 % 2 != 0) {
                numOdd++;
            }
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        
        System.out.println("\nThe number of odd numbers is: " + numOdd);
    }
}
