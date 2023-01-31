package logic;

public class Main {

    private static int divide(int a, int b){
        return a/b;
    }

    public static boolean divisionIsZero(int a, int b){
        boolean isZero = false;
        int result;

        try{
            result = divide(a, b);

            if(result == 0)
                isZero = true;
        } catch(ArithmeticException e){
            isZero = true;
        }

        return isZero;
    }
}
