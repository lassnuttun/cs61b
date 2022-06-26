public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (isLeapYear(Integer.parseInt(args[i]))) {
                System.out.println(Integer.parseInt(args[i]) + " is a leap year.");
            } else {
                System.out.println(Integer.parseInt(args[i]) + " is not a leap year.");
            }
        }
    }
}