package lexicon;

/**
 10. Convert the following String: "ThisShouldBeConverted" to
 a char array. Iterate through the char array and print out
 each element. * */
public class Ex10 {
    public static void ex10()  {
        String str = "ThisShouldBeConverted";
        char[] ch = str.toCharArray();
        for (char c: ch) {
            System.out.println(c);
        }
    }
}
