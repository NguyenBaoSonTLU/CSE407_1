import java.util.List;

public class WeightedGradeImpl implements GradeCalculationImpl {
    @Override
    public double calculate(List<Double> grades) {
        if (grades.size() % 2 != 0) {
            throw new IllegalArgumentException("Invalid grades list: must be even number of elements");
        }

        double total = 0;
        double totalWeight = 0;
        for (int i = 0; i < grades.size(); i += 2) {
            double score = grades.get(i);
            double weight = grades.get(i + 1);

            // Validate inputs
            if (score < 0 || score > 10) {
                throw new IllegalArgumentException("Grade must be between 0 and 10");
            }
            if (weight < 0) {
                throw new IllegalArgumentException("Weight must be non-negative");
            }

            total += score * weight;
            totalWeight += weight;
        }

        return totalWeight > 0 ? total / totalWeight : 0;
    }
}