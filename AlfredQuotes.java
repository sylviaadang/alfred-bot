import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello," + name + ". Lovely to see you.";
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") > -1) {
            return "She's reall of no help. What can I get for you?"
        }
        if (conversation.indexOf("Alfred") > -1 ) {
            return "At your service, naturally. How may I be of assistance?"
        }
        return "Right. And with that I shall reture.";
    }

	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}
