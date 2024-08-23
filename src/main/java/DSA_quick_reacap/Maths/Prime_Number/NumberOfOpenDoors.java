package DSA_quick_reacap.Maths.Prime_Number;

public class NumberOfOpenDoors {
    public static int solution(int value){
        return (int) Math.sqrt(value);
    }
    public static void main(String[] args) {
        int value=4;

        System.out.println("Number of doors open at the end is : "+solution(value));
    }
}
