package Task8_arrND;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public int size;
    public int[][] defMatr = { {1,2,3}, {4,5,6}, {7,8,9} };
    public int[][] newMatr;

    public Matrix(int size) {
        this.size = size;
        System.out.println("Matrix inited");
    }

    public void printMatrix(int[][] matr) {
        for (int[] row : matr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void makeNewMatr() {
        Random r = new Random();
        this.newMatr = new int[this.size][this.size];
        for (int i=0; i < this.size; i++) {
            for (int j=0; j < this.size; j++) {
                this.newMatr[i][j] = r.nextInt(255);
            }
        }
        System.out.println("newMatr filled");
    }

    public int[][] rotate90ToLeft(int[][] matr, String direction) {
        int dim = this.newMatr.length;
        int maxIndex = dim-1;
        int[][] matrRotated = new int[dim][dim];
        for (int i=0; i < dim; i++) {
            for (int j=0; j < dim; j++) {
                //System.out.println(String.format("(%d;%d) -> (%d;%d)", i,j,j,maxIndex-i));
                if (direction.equals("right")) {
                    matrRotated[j][maxIndex-i] = matr[i][j];
                }
                if (direction.equals("left")) {
                    matrRotated[i][j] =  matr[j][maxIndex-i];
                }
            }
        }
        return matrRotated;
    }
}
