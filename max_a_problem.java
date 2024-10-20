public class max_a_problem {
    public static int maxAquaCurtains(String str, int l) {
        int n = str.length();
        int maxCount = 0;
        for (int i = 0; i < n; i += l) {
            int countA = 0;
            for (int j = i; j < i + l && j < n; j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }
            maxCount = Math.max(maxCount, countA);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "abbbaabbb";
        int l = 5;
        System.out.println(maxAquaCurtains(str, l));
    }
}
