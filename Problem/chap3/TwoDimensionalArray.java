public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] Array = new int[4][4];

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                int random = (int)(Math.random() * 10 + 1);
                Array[i][j] = random;
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
