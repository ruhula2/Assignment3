
public class loopPower{

    public static void main(String[] args) {

        final int MAX = 4;

        final double NMAX = 10;

        for( int n=1 ; n<=MAX; n++ ){

            System.out.printf("%10d", n);
        }
        System.out.println();

        for( int n=1; n<= MAX; n++){

            System.out.printf("%10s", "x ");
        }
        System.out.println();

        for(double x = 1; x<= NMAX; x++){

       0.     for(int n = 1; n<=MAX; n++ ){

                System.out.printf("%10.0f",Math.pow(x, n));
            }
            System.out.println();
        }
    }
}

