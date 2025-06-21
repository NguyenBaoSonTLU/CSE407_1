import java.util.List;

public abstract class GradeCalculator {
    protected GradeCalculationImpl implementation;

    public GradeCalculator(GradeCalculationImpl impl) {
        this.implementation = impl;
    }

    public double calculateAverage(List<Double> grades) {
        return implementation.calculate(grades);
    }

    public void displayResult(double avg) {
        System.out.println("Average Grade: " + avg);
    }

    // Optional setter for dynamic implementation change
    public void setImplementation(GradeCalculationImpl impl) {
        this.implementation = impl;
    }
}