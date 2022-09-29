package tasks.task_3;

public class FunctionCalculator {
    private double minX;
    private double maxX;
    private double step;

    public FunctionCalculator(double minX, double maxX, double step) {
        if (minX > maxX)
            throw new IllegalArgumentException();

        this.minX = minX;
        this.maxX = maxX;
        this.step = step;
    }

    public double[][] calculate() {
        int steps = (int)Math.floor((maxX - minX) / step);
        double[][] result = new double[steps][];
        double currX = minX;

        for (int i = 0; i < steps; ++i)
        {
            result[i] = new double[2];
            result[i][0] = currX;
            result[i][1] = func(currX);
            currX += step;
        }

        return  result;
    }

    private double func(double x) {
        return Math.tan(x);
    }
}
