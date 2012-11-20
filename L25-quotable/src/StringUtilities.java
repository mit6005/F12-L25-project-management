
public class StringUtilities {

    /**
     * @return true if and only if s contains t as a substring,
     * e.g. contains("hello world", "world") == true.
     */
    public static boolean contains(String s, String t){
        search:
            for (int i = 0; i < s.length(); ++i) {
                for (int j = 0; j < t.length(); ++j, ++i) {
                    if (s.charAt(i) != t.charAt(j)) continue search;
                }
                return true;
            }
        return false;
    }
    
    
    public static void main(String[] args) {
        System.out.println(contains(
                "Life is wonderful! I am so very very happy all the time",
                "very happy"));
    }
}
