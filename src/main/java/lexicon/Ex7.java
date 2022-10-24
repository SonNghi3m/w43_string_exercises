package lexicon;

/** 7. Parse the following int: 20 to a String and add a 20 to the
 end of the String. Printing it out should return: "2020".
 * */
public class Ex7 {
    public static void ex7()  {
        String str1 = String.valueOf(20);
        System.out.println(str1.concat("20"));
    }
}
