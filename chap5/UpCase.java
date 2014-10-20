// Demonstrate using the bitwise operator '&'
// by turning any lowercase letter into uppercase
// by resetting the 6th bit to 0.

class UpCase {
	public static void main(String args[]) {
		char ch;

		for(int i = 0; i < 10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			// This statement turns off the 6th bit.
			ch = (char) ((int) ch & 65503); // ch is now uppercase

			System.out.print(ch + " ");
		}
	}
}