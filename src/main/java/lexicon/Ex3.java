package lexicon;

/** 3. Given the following String: "Ok this is not as long!"
 create a substring of only "not as long" (excluding the
 exclamation point) and print it out.
 * */
public class Ex3 {
    public static void ex3()  {
        String str = "Ok this is not as long!";
        System.out.println(str.substring(11,str.length()-1));
    }
}
