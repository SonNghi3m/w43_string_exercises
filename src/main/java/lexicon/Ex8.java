package lexicon;

/**
 8. Oil and water don't go well together. Given the String:
 "Oil and Water", split them up into the words "Oil","Water"
 and store them in a String array.
 */

public class Ex8 {
    public static void ex8()  {
        String str = "Oil and Water";
        String[] arr = new String[2];
        arr[0] = str.substring(0,3);
        arr[1] = str.substring(8,13);
        System.out.print(arr[0]);
        System.out.print(arr[1]);
    }
}
