package src.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Hebert";
        nome.concat("Soares");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Hebert Bezerra");
        sb.append(" Soares");
        System.out.println(sb);
    }
}
