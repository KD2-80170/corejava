package javaas1;

  class Q2anspatern
  {
    public static void main(String[] args) {
        int n = 5; // number of rows
        int k = 0; // number of spaces
        for (int i = 1; i <= n; i++) { // loop for upper half
            for (int j = 1; j <= n - i; j++) { // loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i + k; j++) { // loop for stars
                System.out.print("*");
            }
            k++; // increment the number of stars by 1
            System.out.println(); // move to next line
        }
        k = n - 2; // reset the number of stars to n - 2
        for (int i = n - 1; i >= 1; i--) { // loop for lower half
            for (int j = 1; j <= n - i; j++) { // loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i + k; j++) { // loop for stars
                System.out.print("*");
            }
            k--; // decrement the number of stars by 1
            System.out.println(); // move to next line
        }
    }
}