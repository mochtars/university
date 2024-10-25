public class Bitwise {
  public static void main(String[] args) {
    int a = 60;
    int b = 13;

    System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
    System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

    System.out.println();

    // Bitwise AND
    int and = a & b;
    System.out.println("a & b = " + and + " (" + Integer.toBinaryString(and) + ")");

    // Bitwise OR
    int or = a | b;
    System.out.println("a | b = " + or + " (" + Integer.toBinaryString(or) + ")");

    // Bitwise XOR
    int xor = a ^ b;
    System.out.println("a ^ b = " + xor + " (" + Integer.toBinaryString(xor) + ")");

    // Bitwise NOT
    int not = ~a;
    System.out.println("~a = " + not + " (" + Integer.toBinaryString(not) + ")");

    // Left shift (<<)
    int leftShift = a << 2;
    System.out.println("a << 2 = " + leftShift + " (" + Integer.toBinaryString(leftShift) + ")");

    // Right shift (>>)
    int rightShift = a >> 2;
    System.out.println("a >> 2 = " + rightShift + " (" + Integer.toBinaryString(rightShift) + ")");

    // Unsigned right shift (>>>)
    int unsignedRightShift = a >>> 2;
    System.out.println("a >>> 2 = " + unsignedRightShift + " (" + Integer.toBinaryString(unsignedRightShift) + ")");
  }
}
