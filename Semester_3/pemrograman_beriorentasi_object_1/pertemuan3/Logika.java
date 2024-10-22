public class Logika {
  public static void main(String[] args) {

    boolean a,b,c;

    // OR
    System.out.println("OR");
    a = true;
    b = true;
    c = (a || b);
    System.out.println(a + " || " + b + " = " + c);
    a = false;
    b = false;
    c = (a || b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = false;
    c = (a || b);
    System.out.println(a + " || " + b + " = " + c);

    // AND
    System.out.println("\nAND");
    a = true;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = false;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    // XOR
    System.out.println("\nXOR");
    a = true;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = false;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

    // NOT
    System.out.println("\nNOT");
    a = true;
    b = true;
    c = (a != b);
    System.out.println(a + " != " + b + " = " + c);
    a = false;
    b = false;
    c = (a != b);
    System.out.println(a + " != " + b + " = " + c);
    a = true;
    b = false;
    c = (a != b);
    System.out.println(a + " != " + b + " = " + c);
  }
}
