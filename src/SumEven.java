public class SumEven {

    public static void main(String[] args) {
        int sum=0;

        for(int loop = 0 ; loop<=100; loop=loop+2){

            sum = sum +loop;
        }
        System.out.println(sum);
    }
}
