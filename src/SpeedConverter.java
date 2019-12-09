public class SpeedConverter {
    public static void main(String[] args) {

    }

    public static long mph(double kph) {
        if(kph < 0) {
            System.out.println("invalid value");
            return -1;
        }
        else {
            long newMph = Math.round(kph / 1.609);
            System.out.println( kph + "kph equals "+ newMph + "mph");
            return newMph;
        }


    }
}
