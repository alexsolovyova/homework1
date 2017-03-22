public class Number13 {

public static void main(String[] args) {
        Random r = new Random();
        int[][] a = new int[10][10];
 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = r.nextInt(100);
                System.out.print(a[i][j] + " ");
 
            }
            System.out.println();
        }
        int max = a[0][0], min = a[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
}
}