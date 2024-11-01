class Kendaraan {
  // Attributes (fields)
  String nama;
  String jenis;
  String warna;
  char[] plat = {'D', '4', 'B', '1', 'T'};

  // Default Constructor
  public Kendaraan() {
    this.nama = "Tidak ada";
    this.jenis = "Mobil";
    this.warna = "Merah";
    this.plat = new char[] {'D', '4', 'B', '1', 'T'};
  }

  // Overloading Constructor
  public Kendaraan(String nama, String jenis, String warna, char[] plat) {
    this.nama = nama;
    this.jenis = jenis;
    this.warna = warna;
    this.plat = plat;
  }

  // Method to access object members
  void displayInfo() {
    System.out.println("Nama: " + this.nama + ", Jenis: " + this.jenis + ", Warna: " + this.warna + ", plat: " + String.valueOf(this.plat));
  }
}

public class ObjectString {
  public static void main(String[] args) {
    // Creating objects using both constructors
    Kendaraan Kendaraan1 = new Kendaraan();            // Default constructor
    Kendaraan Kendaraan2 = new Kendaraan("Honda Civic 2077", "Mobil", "Hitam", new char[] {'B', '5', 'A', '6', 'I'}); // Overloaded constructor

    // Accessing object members
    Kendaraan1.displayInfo();
    Kendaraan2.displayInfo();

    // Demonstrating this keyword
    Kendaraan1.nama = "CBR 2007";
    Kendaraan1.jenis = "Motor";
    Kendaraan1.warna = "Hitam Putih";
    Kendaraan1.plat = new char[] {'T', '5', '8', '6'};
    Kendaraan1.displayInfo();

    // Working with Literal String
    String stringLiteral = "Selamat datang sahabatkuh";
    System.out.println(stringLiteral);

    // Creating String object
    String stringObject = new String("Welcome to my kelompok");
    System.out.println(stringObject);

    // String vs StringBuffer
    String str = "Bangbang"; // Immutable string
    str.concat(" Beni");
    str.concat(" Hilwa");
    System.out.println("Kelompok: " + str);

    StringBuffer stringBuffer = new StringBuffer("Pemrograman"); // Mutable StringBuffer
    stringBuffer.append(" Beriorentasi");
    stringBuffer.append(" Object");
    System.out.println("Mata kuliah: " + stringBuffer);
  }
}
