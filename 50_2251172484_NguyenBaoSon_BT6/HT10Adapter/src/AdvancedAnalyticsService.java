import java.util.List;

public class AdvancedAnalyticsService {
    public double computeWeightedAverage(List<ScoreEntry> entries) {
        double totalWeightedScore = 0;
        double totalWeight = 0;

        for (ScoreEntry entry : entries) {
            totalWeightedScore += entry.getScore() * entry.getWeight();
            totalWeight += entry.getWeight();
        }

        return totalWeight == 0 ? 0 : totalWeightedScore / totalWeight;
    }
}
