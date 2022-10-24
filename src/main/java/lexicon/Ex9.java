package lexicon;

/**
 * 9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
 * into an array. Print out all names separately.
 * */
public class Ex9 {
    public static void ex9()  {
        String str = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arr = str.split("\\,");
        for (String a:arr) {
            System.out.println(a);
        }
    }
}

