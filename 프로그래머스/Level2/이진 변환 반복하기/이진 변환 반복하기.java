class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        while (!s.equals("1")) {
            int zeros = countZero(s);
            removed += zeros;

            int c = s.length() - zeros;
            s = Integer.toString(c, 2);

            loop++;
        }

        return new int[] {loop, removed};
    }

    private int countZero(String s) {
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            }
        }

        return zeros;
    }
}
