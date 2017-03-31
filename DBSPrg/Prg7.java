import java.util.Deque;
import java.util.LinkedList;

public class Prg7
{
    // Input
    private static int n = 50;
    // If the input array is sorted ascending, the shortest solution is
    // likely to be found somewhere at the end.
    // If the input array is sorted descending, the shortest solution is
    // likely to be found somewhere in the beginning.
    private static int[] input = {100, 80, 66, 25, 4, 2, 1};

    // Shortest possibility
    private static Deque<Integer> shortest;
    // Number of possibilities
    private static int numberOfPossibilities;

    public static void main(String[] args)
    {
        calculate(0, n, new LinkedList<Integer>());
        System.out.println("\nAbove you can see all " + numberOfPossibilities +
            " possible solutions,\nbut this one's the shortest: " + shortest);
    }

    public static void calculate(int i, int left, Deque<Integer> partialSolution)
    {
        // If there's nothing left, we reached our target
        if (left == 0)
        {
            System.out.println(partialSolution);
            if (shortest == null || partialSolution.size() < shortest.size())
                shortest = new LinkedList<Integer>(partialSolution);
            numberOfPossibilities++;
            return;
        }
        // If we overshot our target, by definition we didn't reach it
        // Note that this could also be checked before making the
        // recursive call, but IMHO this gives a cleaner recursion step.
        if (left < 0)
            return;
        // If there are no values remaining, we didn't reach our target
        if (i == input.length)
            return;

        // Uncomment the next two lines if you don't want to keep generating
        // possibilities when you know it can never be a better solution then
        // the one you have now.
//      if (shortest != null && partialSolution.size() >= shortest.size())
//          return;

        // Pick value i. Note that we are allowed to pick it again,
        // so the argument to calculate(...) is i, not i+1.
        partialSolution.addLast(input[i]);
        calculate(i, left-input[i], partialSolution);
        // Don't pick value i. Note that we are not allowed to pick it after
        // all, so the argument to calculate(...) is i+1, not i.
        partialSolution.removeLast();
        calculate(i+1, left, partialSolution);
    }

}