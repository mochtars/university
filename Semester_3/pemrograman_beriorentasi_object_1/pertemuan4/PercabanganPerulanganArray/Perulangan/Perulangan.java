public class Perulangan {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("Loop for ke-" + i);
    }

    int j = 0;
    while (j < 5) {
      System.out.println("Loop while ke-" + j);
      j++;
    }

    int k = 0;
    do {
      System.out.println("Loop do while ke-" + k);
      k++;
    } while (k < 5);
  }
}
