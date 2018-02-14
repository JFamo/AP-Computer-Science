/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        statement = statement.toLowerCase(); //I changed this so cases don't affect stuff
        String response = "";
        if (statement.length() <= 0)
        {
            response = "Are you going to say something?";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
                response = "Tell me more about your family.";
        }
        else if (statement.indexOf("hiryak") >= 0){
                response = "That's my dad!";
        }
        else if (statement.indexOf("social") >= 0){
                response = "I'm very social.";
        }
        else if (statement.indexOf("weather") >= 0){
                response = "Wonderful weather we're having.";
        }
        else if (statement.indexOf("java") >= 0){
                response = "I'm coded in Java.";
        }
        else if (statement.indexOf("jon") >= 0){
                response = "Jon is a better chatbot than I.";
        }
        else if (statement.indexOf("cat") >= 0){
                response = "Mmmmmm delicious.";
        }
        else if (statement.indexOf("math") >= 0){
                response = "I like math.";
        }
        else if (statement.indexOf("hit") >= 0){
                response = "I don't like violence.";
        }
        else if (statement.indexOf("mother") >= 0){
                response = "I don't have a mom.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
