package base;

import java.util.Locale;

public class processamentocasting {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a;
        int b;

        a = 7.0;
        b = (int) a;

        System.out.println(b);
    }
}
