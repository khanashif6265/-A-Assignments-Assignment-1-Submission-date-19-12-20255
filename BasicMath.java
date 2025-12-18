import java.util.Scanner;


class BasicMath {
static int add(int a, int b) { return a + b; }
static int sub(int a, int b) { return a - b; }
static int mul(int a, int b) { return a * b; }
static int div(int a, int b) { return a / b; }
static int rem(int a, int b) { return a % b; }
static int square(int a) { return a * a; }
static int cube(int a) { return a * a * a; }
static int absolute(int a) { return Math.abs(a); }


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();


System.out.println("Addition: " + add(a, b));
System.out.println("Subtraction: " + sub(a, b));
System.out.println("Multiplication: " + mul(a, b));
System.out.println("Division: " + div(a, b));
System.out.println("Remainder: " + rem(a, b));
System.out.println("Square of a: " + square(a));
System.out.println("Cube of a: " + cube(a));
System.out.println("Absolute of a: " + absolute(a));
}
}