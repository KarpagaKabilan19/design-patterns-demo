package behavioral.strategy;

public class AvoidObstacleNavigation implements NavigationStrategy {
    @Override
    public void navigate(int x, int y) {
        System.out.println("Navigating to (" + x + ", " + y + ") while avoiding obstacles");
    }
}