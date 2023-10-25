package src.introducao;

public class Aula06EstruturaDeRepetiao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i++){
            if ((i % 2) == 0){
                System.out.println(i);
            }
        }
    }
}
