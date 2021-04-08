public class SearchArray {
    // test
    public static void main(String[] args) {
        System.out.println(searchArray(new String[]{"bla", "blim"},"test"));
    }
    public static int searchArray(String[] stringArray, String searchString) {
        int index = -1;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(searchString)) index = i;
        }
        return index;
    }
}