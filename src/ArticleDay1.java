public class ArticleDay1 {
    public static void main(String[] args) {
        reverseCompare("adured", "ADURED")
;
    }

    public static void reverseCompare(String s, String y) {

        boolean answer = s.equals(y);
        boolean ans = s.equalsIgnoreCase(y);
        int exc = s.compareTo(y);

        System.out.println(answer);
        System.out.println(ans);
        System.out.println(exc);

        s = s + "galleries";
        StringBuilder sb = new StringBuilder("galleries");
        StringBuilder s2 = sb.append(y);
        StringBuffer sbuf = new StringBuffer("buffered");
        StringBuffer newest = sbuf.append(y);
        String mim = s;

        System.out.println(s);
        System.out.println(s2);
        System.out.println(newest);
        System.out.println(s);

    }
}
