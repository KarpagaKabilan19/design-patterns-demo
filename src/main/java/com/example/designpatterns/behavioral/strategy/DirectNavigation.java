package behavioral.strategy;

public class DirectNavigation implements NavigationStrategy {
    @Override
    public void navigate(int x, int y) {
        System.out.println("Navigating directly to (" + x + ", " + y + ")");
    }
}
