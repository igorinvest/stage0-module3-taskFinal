package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String text = Integer.toString(number);
        int sum = 0;
        for (int i=0; i<text.length(); i++) {
            int n = text.charAt(i) - '0';
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
