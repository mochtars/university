import java.util.Arrays;

public class ArrayResizing {
  public static void main(String[] args) {
    int[] angkaLama = {1, 2, 3};
    int[] angkaBaru = new int[5];

    System.arraycopy(angkaLama, 0, angkaBaru, 0, angkaLama.length);
    System.out.println("Isi angkaBaru setelah disalin: " + Arrays.toString(angkaBaru));
  }
}
