public class DSA27 {
    public static String findWord(String sentence) {
        String[] words = sentence.split(" ");
        String maxWord = "";
        String vowels = "aeiouAEIOU";

        for (String word : words) {
            if (word.length() % 2 == 0 && vowels.indexOf(word.charAt(0)) != -1) {
                if (word.length() > maxWord.length()) {
                    maxWord = word;
                }
            }
        }

        return maxWord.isEmpty() ? "00" : maxWord;
    }

    public static void main(String[] args) {
        System.out.println(findWord("I am enjoying outdoor activities")); // activities
        System.out.println(findWord("This test is on computer"));         // is
        System.out.println(findWord("Strong mind power"));                // 00
    }
}

