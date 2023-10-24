package exercise;


// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static String[][] enlargeArrayImage(String[][] array) {
        int rows = array.length;
        if (rows  == 0) {
            return new String[0][];
        }
        String[][] newArr = new String[array.length * 2][array[0].length * 2];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = array[i / 2].clone()[j / 2];
            }
        }
        return newArr;
    }
}
// END
