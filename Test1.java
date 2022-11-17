package xx;

import java.util.Scanner;
class Location {
    public int row;
    public int column;
    public double maxValue;

    }
public class Test1 {
    public static Location locateLargest(double[][] a) {
            Location lo = new Location();
            lo.maxValue = a[0][0];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (lo.maxValue < a[i][j]) {
                        lo.maxValue = a[i][j];
                        lo.row = i;
                        lo.column = j;
                    }
                }
            }
            return lo;
    }
        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of rows and columns in the array:");
            int a = in.nextInt(), b = in.nextInt();
            double[][] ar = new double[a][b];
            System.out.println("Enter the array:");
            for (int i = 0; i < a; i++)
                for (int j = 0; j < b; j++)
                    ar[i][j] = in.nextDouble();
            in.close();
            Location loc = locateLargest(ar);// 调用后面的方法
            System.out.println(
                    "The location of the largest element is " + loc.maxValue + " at(" + loc.row + "," + loc.column + ")");
        }
}
