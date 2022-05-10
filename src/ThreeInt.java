import java.util.Arrays;

public class ThreeInt {
    public  static int[] returnArray() {
        int one =20;
        int two = 10;
        int three = 30;
        return new int[]{one,two,three};
    }
    public static void main(String[] args) {
        int [] arr=returnArray();
        System.out  .println(Arrays.toString(arr));
    }
}

