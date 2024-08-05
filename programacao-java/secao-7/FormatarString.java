public class FormatarString {
    public static void main(String[] args) {
        String original, s01, s02, s03, s04, s05, s06, s07;
        int i, j;

        original = "abcde FGHIJ ABC abc DEFG   ";
        s01 = original.toLowerCase();
        s02 = original.toUpperCase();
        s03 = original.trim();
        s04 = original.substring(2);
        s05 = original.substring(2, 9);
        s06 = original.replace('a', 'Z');
        s07 = original.replace("abc", "xy");
        i = original.indexOf("bc");
        j = original.lastIndexOf("bc");
         

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'Z'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy' ): -" + s07 + "-");
        System.out.println("indexOf('bc'): -" + i);
        System.out.println("lastIndexOf('bc'): -" + j);

        String s, word1, word2, word3;
        s = "potato apple lemon";

        String[] vect;
        vect = s.split(" ");

        word1 = vect[0];
        word2 = vect[1];
        word3 = vect[2];

        System.out.println("String 's': " + s);
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: "  + word2);
        System.out.println("Word 3: "  + word3);
        

    }
}
