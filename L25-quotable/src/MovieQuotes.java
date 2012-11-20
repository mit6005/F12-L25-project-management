
public class MovieQuotes {
    private static final String[] quotes = new String[] {
        "Wherever you go... there you are.\n--Buckaroo Banzai",
    };
    
    /**
     * @return a randomly-chosen movie quote
     */
    public static String randomQuote() {
        int i = (int) (Math.random() * quotes.length);
        return quotes[i];
    }

    /**
     * Print a random movie quote to standard out.
     */
    public static void main(String[] args) {
        System.out.println(randomQuote());
    }
}
