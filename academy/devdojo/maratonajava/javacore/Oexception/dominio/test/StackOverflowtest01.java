package academy.devdojo.maratonajava.javacore.Oexception.dominio.test;

public class StackOverflowtest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
