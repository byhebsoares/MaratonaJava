package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
     try {
         return a/b;
     }catch (RuntimeException e){
        e.printStackTrace();
     }
     return 0;
    }
}
