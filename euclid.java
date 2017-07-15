/*
Find the gcd of any RECTANGLE by dividing the longest side by the shortest side until the longest side is divided evenly.
*/
public class euclid {
    public static void main(String[] args) {
        System.out.println("gcd = " + rec(345,150));
    }
    //Iterative:
    static int iter(int max, int min){ 
        int rem = max % min;
        while(true){
            max = min;
            min = rem;
            rem = max % min;
            if(rem == 0){
                break;
            }
        }
        return min;
    }
    //Recursive:
    static int rec(int max, int min){
        int rem = max % min;
        if(rem == 0){
            return min;
        }
        return rec(min,rem);
    }
}
