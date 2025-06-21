import java.util.List;

public class ScoreContext {
    private ScoreStrategy strategy;

    public void setStrategy(ScoreStrategy strategy) {
        this.strategy = strategy;
    }

    public float calculate(List<Float> scores) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.calculate(scores);
    }
}
