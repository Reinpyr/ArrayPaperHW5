import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float values [] = {0,9,10,219, 81, -218, -19};
        float cs [] = new float [values.length];
        float sum = 0;

        for(int i = 0; i < values.length; i = i + 1)
        {
            sum = sum + values[i];
            cs[i]=sum;
        }
        System.out.println("Original array: " + Arrays.toString(values));
        System.out.println("Cumulative sum: " + Arrays.toString(cs));
    }
}