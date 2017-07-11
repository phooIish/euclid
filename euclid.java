/*
Find the gcd of any RECTANGLE by dividing the longest side by the shortest side until the longest side is divided evenly.
*/
public class euclid {
    public static void main(String[] args) {
        System.out.println("gcd = " + gcd(345,150));
    }
    static int gcd(int max, int min){
        int gcd = max % min;
        while(true){
            max = min;
            min = gcd;
            gcd = max % min;
            if(gcd == 0){
                break;
            }
        }
        return min;
    }
}
