package edu.cnm.deepdive;

public class TheConditionalOperators {

  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean d = a && b;//d will be false because both booleans need to be true with the && operator
    boolean e = a || b;//d will be true if one of the booleans is true with the || operator

    int f = 4;
    boolean g = false && (f++ < 4);//first evaluation states false so, since this is short circuited
    //evaluation, the second part (f++ < 4) will not even be executed meaning that f stays 4.
    boolean h = (f-- == 4) && !g;//4 == 4 is true (f is now 3) and !g is true so outcome is true.

    int myInt = 3;
    int anotherInt = 4;
    boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
    //conditional operators are viewed from left to right.
    //(true) && second condition needs to be evaluated when the first one is true.
    //(true) && (true) gives true and anotherInt is now 3
    // (true) || .... will give true with the || operator so second boolean will not be executed
    //and the value of myInt stays 3.
    //myBoolean is true, myInt is 3 and anotherInt is 3.

    boolean x = true, z = false;
    int y = 20;
    x = (y != 10) ^ (z = false);
    //x = (true) ^ (false) so x is true, z is false and y is 20.
  }

}
