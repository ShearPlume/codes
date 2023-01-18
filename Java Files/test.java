import java.util.*;

class ListingWords {
    static List<String> scan(String line) {
        String[] wordArray = line.split("[[^A-Z]&&[^a-z]]+");
        List<String> wordList = new ArrayList<String>();
        for (String word : wordArray)
            wordList.add(word);
        return wordList;
    }

    public static void main(String[] args) {
        List<String> words = scan("To be, or not to be");
        for (String w : words)
            System.out.println(w);

    }
}