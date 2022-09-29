package tasks.task_1;

public class FormulaCalculator {
    private double x;
    private double y;

    public FormulaCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double tmp = 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2));
        double denominator = 2 + Math.abs(x - tmp);
        return numerator / denominator + x;
    }
}
