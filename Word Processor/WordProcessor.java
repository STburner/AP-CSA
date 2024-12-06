/**
 * This class performs some basic word processing functions, 
 * namely find, remove, and replace.
 *
 * @author  (Your Name)
 * @version (Today's Date)
 */
public class WordProcessor {

    /**
     * Finds the first occurrence of the specified item in the given phrase.
     *
     * @param phrase The string to search within.
     * @param item   The string to find.
     * @return True if the item is found in the phrase, otherwise false.
     */
    public boolean find(String phrase, String item) {
        return phrase.indexOf(item) != -1;
    }

    /**
     * Removes the first occurrence of the specified item from the given phrase.
     *
     * @param phrase The string to modify.
     * @param item   The string to remove.
     * @return The modified string with the item removed, or the original string
     *         if the item is not found.
     */
    public String remove(String phrase, String item) {
        if (find(phrase, item)) {
            int position = phrase.indexOf(item);
            String before = phrase.substring(0, position);
            String after = phrase.substring(position + item.length());
            return before + after;
        }
        return phrase;
    }

    /**
     * Replaces the first occurrence of the specified item in the given phrase 
     * with the replacement string.
     *
     * @param phrase      The string to modify.
     * @param item        The string to replace.
     * @param replacement The string to insert in place of the item.
     * @return The modified string with the item replaced, or the original 
     *         string if the item is not found.
     */
    public String replace(String phrase, String item, String replacement) {
        if (find(phrase, item)) {
            int position = phrase.indexOf(item);
            String before = phrase.substring(0, position);
            String after = phrase.substring(position + item.length());
            return before + replacement + after;
        }
        return phrase;
    }
}
