import java.util.Scanner;

public class FindMax2DArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[][] array = {{0, 983, 787, 714},
                {983, 0, 214, 1102},
                {787, 214, 0, 888},
                {714, 1102, 888, 323},
                {1375, 1763, 1549, 661},
                {967, 1723, 1548, 781},
                {1087, 1842, 1627, 810}};
        int[] location = findMax(array);
        System.out.println("Max value: " + location[2] +" at row: " + (location[0] + 1) + " and column: " + (location[1] + 1));


    }
    public static int[] findMax(int[][] array) {
        int max = array[0][0];
        int[] result = new int[3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    result[0] = i;
                    result[1] = j;
                    result[2] = max;
                }
            }
        }
        return result;
    }

}


