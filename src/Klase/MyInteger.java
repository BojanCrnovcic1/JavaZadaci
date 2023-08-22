package Klase;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean eguals(int value) {
        return this.value == value;
    }

    public boolean eguals(MyInteger myInteger) {
        return myInteger.eguals(value);
    }

    public static int parseInt(char[] array) {
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value  += (array[i] - '0') * Math.pow(10, array.length - i - 1);
        }
        return value;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
