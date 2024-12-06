/**
 * This class represents a crossword entry and clue as a String.
 *
 * @author  
 * @version (today's date)
 */
public class SecretCrossword
{
    /** This instance variable will hold a combined crossword entry
     *  and clue. The String begins with the crossword entry, which
     *  is a grouping of capital letters followed by a single blank 
     *  space, followed by the clue (which may contain more blank
     *  spaces). In other words, the crossword entry and the clue 
     *  are separated by a single blank space.
     */ 
    private String crosswordClue;

    /** Constructor that sets the crosswordClue instance variable. */
    public SecretCrossword(String cwc)
    {
        crosswordClue = cwc;
    }

    /** Returns the number of characters of the crossword entry */
    public int getEntryLength()
    {
        // Find the index of the first blank space
        int spaceIndex = crosswordClue.indexOf(" ");
        return spaceIndex;
    }

    /** Extracts and returns the crossword entry */
    public String getEntry()
    {
        // Extract substring up to the first blank space
        return crosswordClue.substring(0, getEntryLength());
    }

    /** Extracts and returns the clue */
    public String getClue()
    {
        // Extract substring after the first blank space
        return crosswordClue.substring(getEntryLength() + 1);
    }

    /** Returns the first letter of the entry */
    public String getFirstLetter()
    {
        // Return the first character of the entry as a String
        return crosswordClue.substring(0, 1);
    }

    /** Returns true if guess matches crossword entry (exactly);
        false otherwise */
    public boolean isCorrectGuess(String guess)
    {
        // Compare the guess with the crossword entry
        return guess.equals(getEntry());
    }
}
