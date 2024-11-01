public class CopyingArrays {
  public static void main(String[] args) {
    int[] angkaAsli = {10, 20, 30};
    int[] angkaSalinan = new int[angkaAsli.length];

    System.arraycopy(angkaAsli, 0, angkaSalinan, 0, angkaAsli.length);

    System.out.println("Isi angkaSalinan setelah disalin:");
    for (int i = 0; i < angkaSalinan.length; i++) {
      System.out.println(angkaSalinan[i]);
    }
  }
}
