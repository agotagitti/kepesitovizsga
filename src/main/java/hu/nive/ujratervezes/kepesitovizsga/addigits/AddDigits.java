package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String  number) {
        if (number == null || number.isBlank()) {
            return -1;
        }
        char[] stringData = number.toCharArray();
        return getSum(stringData);
    }

    private int getSum(char[] stringData) {
        int sum = 0;
        for (char actualChar : stringData) {
            if (Character.isDigit(actualChar)) {
                sum += Character.getNumericValue(actualChar);
            }
        }
        return sum;
    }
}
