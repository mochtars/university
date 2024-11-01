public class Percabangan {
  public static void main(String[] args) {
    int nilai = 70;

    if (nilai >= 90) {
      System.out.println("Nilai anda: A");
    } else if (nilai >= 75) {
      System.out.println("Nilai anda: B");
    } else {
      System.out.println("Nilai anda: C");
    }
  }
}

class Switch {
  public static void main(String[] args) {
    int angka = 3;

    switch (angka) {
      case 1:
        System.out.println("Angka adalah satu");
        break;
      case 2:
        System.out.println("Angka adalah dua");
        break;
      case 3:
        System.out.println("Angka adalah tiga");
        break;
      default:
        System.out.println("Angka tidak dikenali");
        break;
    }
  }
}
