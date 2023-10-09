package NumberOfStepsToReduceANumberToZero;

public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            step ++;
            if (num % 2 == 0) {
                num /= 2 ;
                System.out.printf("num : " +num + "\n");
            } else {
                num --;
                System.out.printf("num : " +num + "\n");
            }
        }
        return step;
    }

//    public int numberOfStepsWithBits(int num) {
//        int step = 0;
//
//    }

    public static void main(String[] args) {
        int n = 14;
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        int res = numberOfStepsToReduceANumberToZero.numberOfSteps(n);

        System.out.printf("res: " + res);
    }
}
