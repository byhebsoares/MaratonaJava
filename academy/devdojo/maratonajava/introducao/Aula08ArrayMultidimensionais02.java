package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][]; // forma 1 de inicializar o array

        arrayInt[0] = new int[]{5,50};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayInt2 = {{0,1},{5,8,6},{10,50,60,45,78,53}}; // forma 2 de inicializar o array

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n------");
            for (int num : arrayBase){
                System.out.println(num + "  ");
            }
        }
    }
}
