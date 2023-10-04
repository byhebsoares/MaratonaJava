package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeBR = new Locale("pt","BR");
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

    }
}
