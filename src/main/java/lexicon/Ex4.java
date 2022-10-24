package lexicon;

/** 4. Convert the following String: "CAPS EQUALS SCREAMING" to
 lowercase and print it out. Then convert it back to
 uppercase and print it out again.
 * */
public class Ex4 {
    public static void ex4()  {
        String str = "CAPS EQUALS SCREAMING";
        str = str.toLowerCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
    }
}