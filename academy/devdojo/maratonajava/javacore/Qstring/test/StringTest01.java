package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Hebert";
        String nome2 = "Hebert 2";
        nome = nome.concat(nome);
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Hebert");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
