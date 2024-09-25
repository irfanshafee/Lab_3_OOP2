public class NumWordPrinter {

    public String printWord(int num, boolean uppercase) {
        String result;


        if (num % 2 == 0 && num % 11 == 0 && num % 13 == 0) {
            result = "EvenPrimeLucky";
        } else if (num % 2 == 0 && num % 11 == 0) {
            result = "EvenPrimeEleven";
        } else if (num % 2 == 0) {
            result = "Even";
        } else if (num % 11 == 0) {
            result = "PrimeEleven";
        } else if (num % 13 == 0) {
            result = "LuckyThirteen";
        } else {
            result = "OddOneOut";
        }


        return result;
    }

}