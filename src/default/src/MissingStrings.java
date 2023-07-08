import java.util.ArrayList;
import java.util.Arrays;


// Find the missing strings:
//Given two strings, s1, and s2, find the missing strings in s1 that are not in s2 and return them as an ArrayList of
//Strings.
//Example: If s1 = "Hello my name is Cody" and s2 = "My is Cody", return a list of missing words, such as
//["hello", "name"].

public class MissingStrings {
//    get str1 and str2
//    find missing words in str1 from str2
    public static ArrayList<String> findMissingStrings(String s1, String s2){
        //Split string into arrays of words
        String[] words1 = s1.toLowerCase().split("\\s+");
        String[] words2 = s2.toLowerCase().split("\\s+");


        // Convert the array of words2 to an ArrayList for efficient containment check
        ArrayList<String> words2List = new ArrayList<String>(Arrays.asList(words2));

        // Create an ArrayList to store the missing words
        ArrayList<String> missingWords = new ArrayList<>();

        // Iterate through words1 and check if each word is present in words2List
        for(String word : words1){
            if(!words2List.contains(word)){
                missingWords.add(word);
            }
        }
        return missingWords;
    }

    public static void main(String[] args) {
        String s1 = "Hello my name is Cody";
        String s2 = "My is Cody";


        ArrayList<String> missingWords = findMissingStrings(s1, s2);

        System.out.println("Missing Words: " + missingWords);
    }
}

