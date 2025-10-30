

public class StringySpells {

    public static String middleFinder(String i) {
        int len1 = i.length();
        int middle = len1 / 2;
        return i.substring(middle,middle +1 );
    }

    public static String alphaOmega(String a, String b) {
        String alpha = a.substring(0,1);
        int len = b.length();

        String beta = b.substring(len - 1, len);
        return alpha + beta;
    }

    public static String subtractive(String a, int b) {
        return a.substring(0,b) + a.substring(b+1);
    }

    public static String flipper(String one, String two) {
        String first = one.substring(0);
        String second = two.substring(0,1);
        return second + first;


    }


    public static double aveLen(String s1, String s2) {
        double len1 = s1.length();
        double len2 = s2.length();
        return (len1 + len2) / 2;
    }



}//end of class