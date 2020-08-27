public class simpleMath {
    public static void main(String[] args) {
        int firstNumber = 420;
        int secondNumber = 69;

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int prod = firstNumber * secondNumber;
        double quotWithoutDecimal = firstNumber / secondNumber;
        double quotWithDecimal = (double)firstNumber / (double)secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + diff);
        System.out.println(firstNumber + " x " + secondNumber + " = " + prod);
        System.out.printf(firstNumber + " / " + secondNumber + " = " + "%.4f %s", quotWithDecimal, "When you cast the variable to double\n");
        System.out.printf(firstNumber + " / " + secondNumber + " = " + "%.4f %s", quotWithoutDecimal, "When you leave the variable as int");


    }
}
