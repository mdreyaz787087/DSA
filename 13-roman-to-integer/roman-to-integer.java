
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value;

            switch (s.charAt(i)) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
                default:
                    throw new IllegalArgumentException(
                        "Invalid Roman numeral"
                    );
            }

            if (value < previous) {
                total -= value;
            } else {
                total += value;
            }

            previous = value;
        }

        return total;
    }
}
