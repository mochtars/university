import java.util.Scanner;

// Keranjang
class Keranjang {
  int id;
  int jumlah;

  Keranjang() {
    this.id = -1;
    this.jumlah = -1;
  }
  Keranjang(int id, int jumlah) {
    this.id = id;
    this.jumlah = jumlah;
  }
}

// Account
class Account {
  Scanner scanner = new Scanner(System.in);
  Keranjang keranjang[] = new Keranjang[10];

  private String username;
  private String password;

  Account(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Login validasi
  public boolean validasiAkun(String username, String password) {
    return this.username.equals(username) && this.password.equals(password);
  }
  // Mengatur keranjang
  public void setKeranjang(int idProduct, int jumlah) {
    if (idProduct == -1) {
      for (int i = 0; i < keranjang.length; i++) {
        keranjang[i] = null;
      }
    } else {
      for (int i = 0; i < keranjang.length; i++) {
        if (keranjang[i] == null) {
          keranjang[i] = new Keranjang(idProduct, jumlah);
          break;
        } else if (keranjang[i].id == idProduct) {
          keranjang[i].jumlah += jumlah;
          break;
        }
      }
    }
  }
  // Mendapatkan keranjang
  public void getKeranjang(Product[] products) {
    int pilihan = 0;
    int jumlahKeranjang = 0;
    int total = 0;

    for (Keranjang data : keranjang) {
      if (data != null) jumlahKeranjang++;
    }

    System.out.println("\nKeranjang anda (" + jumlahKeranjang + ")");

    for (Keranjang data : keranjang) {
      if (data != null) {
        System.out.println("  -> " + products[data.id].nama + " x" + data.jumlah + " (Rp " + products[data.id].harga * data.jumlah + ")");
        total += products[data.id].harga * data.jumlah;
      }
    }

    double totalDesimal = (double) total;

    System.out.println("Total: Rp " + totalDesimal);
    System.out.println("\n--> Menu <--");
    System.out.println("1. Checkout");
    System.out.println("2. Bersihkan Keranjang");
    System.out.println("0. Kembali ke menu utama");
    // Pilihan
    System.out.print("Silahkan pilih menu: ");
    pilihan = scanner.nextInt();

    switch (pilihan) {
      case 1:
      checkout(total);
      break;
      case 2:
      setKeranjang(-1, 0);
      System.out.println("Keranjang berhasil di bersihkan...\n");
      break;
      default:
      break;
    }
  }
  // checkout
  public void checkout (int total) {
    double totalDesimal = (double) total;
    System.out.print("\nPembelian anda berhasil, Pembayaran anda Rp " + totalDesimal + ", dikurangi dari rekening anda.\n\n");
  }

}
// Product Detail
class ProductDetail {
  char icon; 
  int harga;
  int stok; 

  public ProductDetail(char icon, int harga, int stok) {
    this.icon = icon;
    this.harga = harga;
    this.stok = stok;
  }
}
// Product
class Product extends ProductDetail {
  String nama;

  public Product() {
    super('x', 0, 0);
    this.nama = "";
  }
  public Product(String nama, char icon, int harga, int stok) {
    super(icon, harga, stok);
    this.nama = nama;
  }
}

// Program utama
public class MataUang {
  private static Scanner scanner = new Scanner(System.in);

  static Product[] products = new Product[6];
  static Account account = new Account("nani", "kore");

  public static void init() {
    products[0] = new Product();
    products[1] = new Product("Dollar", '$', 15943, 46);
    products[2] = new Product("Pound", '£', 19965, 32);
    products[3] = new Product("Ruble", '₽', 152, 10);
    products[4] = new Product("Yen", '¥', 102, 19);
    products[5] = new Product("Won", '₩', 11, 7);
  }

  public static void tambahProduct() {
    int pilihan;
    int jumlah = 0;

    System.out.println("\nList products:");

    for (int i = 1; i < products.length; i++) {
      String stok = products[i].stok > 0 ? String.valueOf(products[i].stok) : "Habis" ;
      String stokOutput = " (stok: " + stok + ")";
      System.out.println(i + ". " + products[i].nama  + ": " + products[i].icon + "1 = Rp " + products[i].harga + stokOutput);
    }

    System.out.print("Silahkan pilih produk: ");
    pilihan = scanner.nextInt();

    System.out.print("Masukan Jumlah: ");
    jumlah = scanner.nextInt();

    if (products[pilihan].stok >= jumlah) {
      products[pilihan].stok -= jumlah;
      account.setKeranjang(pilihan, jumlah);
      System.out.println("\nBerhasil menambahkan " + products[pilihan].icon + jumlah + " " + products[pilihan].nama + " ke keranjang.\n");
    } else {
      System.out.println("\nGagal menambahkan " + products[pilihan].icon + jumlah + " " + products[pilihan].nama + " ke keranjang, stok tidak cukup!\n");
    }
  }

  public static boolean menu() {

    int pilihan;

    System.out.println("--> Jual Mata Uang Asing <--");
    System.out.println("1. Lihat Product");
    System.out.println("2. Lihat keranjang");
    System.out.println("0. Keluar program");
    System.out.print("Silahkan pilih menu: ");

    pilihan = scanner.nextInt();

    switch (pilihan) {
      case 1:
        tambahProduct();
        break;
      case 2:
        account.getKeranjang(products);
        break;
      default:
        return false;
    }

    return true;
  }
  // Login
  public static boolean login() {
    String username;
    String password;
    /*
    Mengambil input
    username dan password dari user
    */
    System.out.print("Username: ");
    username = scanner.nextLine();
    System.out.print("Password: ");
    password = scanner.nextLine();

    return account.validasiAkun(username, password);
  }
  // Main
  public static void main(String[] args) {

    init();
    System.out.println("Selamat datang di program jual mata uang asing");
    System.out.println("PT BENI MOCHTAR SAMIRAHARJA");

    System.out.println("\n(username: nani, password: kore)");
    System.out.println("--> Login <--");

    // Login
    while(!login()) {
      System.out.println("Username atau password salah!\n");
    } 

    // Setelah Login Berhasil
    System.out.println("--- login berhasil ---\n");
    while (true) {
      // Jika input user tidak ada di pilihan atau 0, keluar program
      if (!menu()) break;
    }
    scanner.close();
  }
}

