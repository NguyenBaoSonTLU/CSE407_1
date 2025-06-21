import java.util.ArrayList;
import java.util.List;

public class WeightedGradeAdapter implements GradeCalculator {
    private AdvancedAnalyticsService service;

    public WeightedGradeAdapter(AdvancedAnalyticsService service) {
        this.service = service;
    }

    @Override
    public double calculateAverage(double[] scores) {
        List<ScoreEntry> entries = new ArrayList<>();

        // Giả sử trọng số mặc định là 1 cho mỗi điểm
        for (double score : scores) {
            entries.add(new ScoreEntry(score, 1));
        }

        return service.computeWeightedAverage(entries);
    }
}
