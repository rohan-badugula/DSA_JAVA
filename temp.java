public class temp {
    public static String solution(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int month = 12; month >= 1; month--) {
            for (int day = daysInMonth[month - 1]; day >= 1; day--) {
                String mm = String.format("%02d", month);
                String dd = String.format("%02d", day);
                String candidate = mm + "-" + dd;

                if (matches(date, candidate)) {
                    return candidate;
                }
            }
        }

        return "xx-xx";
    }

    private static boolean matches(String pattern, String candidate) {
        for (int i = 0; i < 5; i++) {
            if (pattern.charAt(i) != '?' && pattern.charAt(i) != candidate.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testDates = {
            "?1-31",
            "02-??",
            "??-4?",
            "09-31",
            "1?-??",
            "??-??"
        };

        for (String date : testDates) {
            System.out.println("Input: " + date + " => Output: " + solution(date));
        }
    }
}