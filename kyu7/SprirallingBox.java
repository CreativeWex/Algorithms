package kyu7;/*
    =====================================
    @project Algorithms
    @created 06/02/2023    
    @author Bereznev Nikita @CreativeWex
    =====================================
 */

public class SprirallingBox {
    public static int[][] createBox(int width, int length) {
        int[][] arr = new int[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == 0 || i == width - 1) || (j == 0 || j == length - 1)) {
                    arr[i][j] = 1;
                } else if (i == 1 || i == width - 2 || j == 1 || j == length - 2) {
                    arr[i][j] = 2;
                } else {
                    arr[i][j] = 3;
                }
            }
        }
        return arr;
    }
}
