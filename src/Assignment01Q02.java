public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double res = 0;
        int input = Integer.parseInt(args[0]);

        for (int i = 0; i < input; i++){
            if (i % 2 == 0){
                res += 1.0 / ((2*i) + 1);
            }
            else {
                res -= 1.0 / ((2*i) + 1);
            }
        }
        approxPi = 4 * res;
        System.out.println(approxPi + " " + actualPi);
    }
}
