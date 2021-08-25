import java.util.*;

class diagonalLefttriangle {
    public static void main() {
        Scanner in = new Scanner(System.in);
        // a[][]=new int[ you can change it to any value ][ you can change it to
        // anyvalue ]
        int a[][] = new int[5][5], i, j;
        System.out.println("Enter any 25 numbers : ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.print(" ");
        System.out.println("Converted into 5*5 matrix : ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(" ");
        System.out.println("Converted into Left 90 Degree triangle : ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i >= j)
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
