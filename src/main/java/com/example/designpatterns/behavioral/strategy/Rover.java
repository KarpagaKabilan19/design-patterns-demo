package behavioral.strategy;

public class Rover {
    private NavigationStrategy strategy;

    public void setStrategy(NavigationStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public void performNavigation(int x, int y) {
        if (strategy == null) {
            throw new IllegalStateException("Navigation strategy not set");
        }
        strategy.navigate(x, y);
    }
}
