/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package stringPrograms;

/**
 * @author 91895
 *
 */
public class ReverseWords2 {
    public static void main(String[] args) {
        String input = "Welcome to Amazon";
        reverseWords(input); // Output: "olleH dlroW"
    }
    // Method to reverse each word in a string
    public static void reverseWords(String input) {
        // Split the string by spaces to get words
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Reverse each word and build the result string
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
//            result.append(reversedWord).append(" ");
            System.out.print(reversedWord+" ");
        }

        // Remove the trailing space and return the result
//        return result.toString().trim();
//        return result.toString();
    }
}
