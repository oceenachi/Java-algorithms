public class Alternate {

    public static void main(String[] args) {
//        String tester = "AAABBBAAABBBAAABBBAABBAABBAABBAABBAABBAABB";
        String tester ="AABAAB";
        System.out.println(alternate(tester));
    }

    public static int alternate (String closePattern) {
        int patternLength = closePattern.length();
        char arr[] = closePattern.toCharArray();
        if (patternLength == 1) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arr[0]);
        int deleted = 0;
        for(int i = 1; i < patternLength -1; i++) {
            if(stringBuilder.charAt(0) != arr[i] ) {
                stringBuilder.insert(0, arr[i]);
                deleted += 1;
            }
            continue;
        }

        return patternLength - deleted;
    }
}

