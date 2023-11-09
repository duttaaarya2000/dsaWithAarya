package $19Recursion;

public class NumberToWords {

    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        int number = 2019;
        System.out.println(numberToWords(number));
    }

    public static String numberToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        return convertToWords(number).trim();
    }

    private static String convertToWords(int num) {
        if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convertToWords(num % 10);
        } else if (num < 1000) {
            return ones[num / 100] + " hundred " + convertToWords(num % 100);
        } else {
            return ones[num / 1000] + " thousand " + convertToWords(num % 1000);
        }
    }
}
