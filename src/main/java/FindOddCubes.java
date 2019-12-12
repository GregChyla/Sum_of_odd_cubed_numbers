import java.util.Arrays;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .map(x -> (int) Math.pow(x, 3))
                .filter(x -> x % 2 != 0)
                .sum();
    }
}
