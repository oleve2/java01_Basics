package Task8_arrND;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(8);
        m1.printMatrix(m1.defMatr);
        System.out.println(m1.defMatr.length);

        m1.makeNewMatr();
        System.out.println("m1.newMatr=");
        m1.printMatrix(m1.newMatr);
        int[][] rotate90 = m1.rotate90ToLeft(m1.newMatr, "right");
        System.out.println(" ");
        System.out.println("rotation results:");
        m1.printMatrix(rotate90);
    }
}
