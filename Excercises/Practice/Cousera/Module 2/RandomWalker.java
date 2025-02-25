public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int steps = 0;

        // Print the starting point
        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) < r) {
            double direction = Math.random(); // Use Math.random() instead of Random

            if (direction < 0.25) {
                x++;
            } else if (direction < 0.5) {
                y++;
            } else if (direction < 0.75) {
                x--;
            } else {
                y--;
            }

            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        // Print the total number of steps taken
        System.out.println("steps = " + steps);
    }
}


