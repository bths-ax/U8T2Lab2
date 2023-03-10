import java.util.ArrayList;

public class Algorithm2DArrays {
	/** Return true if target is found in the 2D array arr, false otherwise.
	 *  For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
	 *  and target is 5, this method returns true. If target is 15, returns false
	 *
	 *  @param arr  2D array of ints
	 *  @param target  target value to be searched for in arr
	 *  @return  true if target is found at least once in arr; false otherwise
	 */
	public static boolean isFound(int[][] arr, int target) {
		for (int[] row : arr)
			for (int item : row)
				if (item == target)
					return true;
		return false;
	}

	/** Return the number of elements in arr that contain searchStr as a substring
	 *  For example, if arr is:
	 *                  {{"hi", "bye", "howl", "goo"},
	 *                   {"time", "owl", "you", "good"},
	 *                   {"map", "low", "bow", "mom"}};
	 *  and searchStr is "ow", this method returns 4, because 4 strings in arr
	 *  contain "ow" as a substring.
	 *
	 *  @param arr  2D array of Strings
	 *  @param searchStr  value to be searched for in each String of arr
	 *  @return  the number of elements that contain searchStr as a substring
	 */
	public static int countElementsWithSubstring(String[][] arr, String searchStr) {
		int cnt = 0;
		for (String[] row : arr)
			for (String item : row)
				if (item.indexOf(searchStr) != -1)
					cnt++;
		return cnt;
	}

	/** Replaces all even integers in arr with 0; all odd integers are unchanged.
	 *  It then returns the number of changes that were made.
	 *
	 *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
	 *  then this method modifies arr to be:
	 *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
	 *  and returns 8 (the number of even numbers replaced by 0)
	 *
	 *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT! 
	 *
	 *  @param arr  2D array of ints
	 *  @return  the number of changes made
	 */
	public static int replaceEvensWithZero(int[][] arr) {
		int changes = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
					changes++;
				}
			}
		}
		return changes;
	}

	/** Return the sum of all elements of arr that are in the one particular row, 
	 *  specified by the row parameter
	 *
	 *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
	 *
	 *  @param arr  2D array of ints
	 *  @param row  the row to add up
	 *  @return  the sum of all elements in row
	 */
	public static int sumForRow(int[][] arr, int row) {
		int sum = 0;
		for (int item : arr[row])
			sum += item;
		return sum;
	}

	/** Return the sum of all elements of arr that are in the one particular column 
	 *
	 *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
	 *
	 *  @param arr  2D array of ints
	 *  @param col  the column to add up
	 *  @return  the sum of all elements in column
	 */
	public static int sumForColumn(int[][] arr, int col) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i][col];
		return sum;
	}

	/** Creates a 2D array of ints of size n x m, where n is number of rows and
	 *  m is number of columns; the elements in the 2D array should be numbered 0
	 *  through n x m - 1, with the numbers filled top to bottom, left to right.
	 *  The method prints the 2D array "grid" of numbers, and also returns
	 *  the 2D array.
	 *
	 *  For example, for rows = 3 and cols = 4, this method should print
	 *  (and return):
	 *  0 1 2 3
	 *  4 5 6 7
	 *  8 9 10 11
	 *
	 *  Print each element with a single space in between.
	 *
	 *  @param rows  number of rows
	 *  @param cols  number of columns
	 *  @return  the same 2D array "number grid" that gets printed by the method
	 */
	public static int[][] printNumberGrid(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = i * cols + j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		return arr;
	}

	/** Creates and returns a square 2D array of Strings of size n x n; the
	 *  elements in the 2D array alternate between "X" and "O" (letter),
	 *  starting with "X"
	 *
	 *  For example, if n = 5, this method should return the following 2D array
	 *  (with 5 rows and 5 columns):
	 *  X O X O X
	 *  O X O X O
	 *  X O X O X
	 *  O X O X O
	 *  X O X O X
	 *
	 *  For example, if n = 6, this method should return the following 2D array
	 *  (with 6 rows and 6 columns):
	 *  X O X O X O
	 *  O X O X O X
	 *  X O X O X O
	 *  O X O X O X
	 *  X O X O X O
	 *  O X O X O X
	 *
	 *  @param n  number of rows and cols (creating square 2D array of size n x n)
	 *  @return  a 2D array of Strings that alternate between "X" and "O"
	 */
	public static String[][] gridOfXandO(int n) {
		String[][] arr = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 == 0) {
					arr[i][j] = "X";
				} else {
					arr[i][j] = "O";
				}
			}
		}
		return arr;
	}

	/** Searches through the 2D array wordChart and finds all strings with
	 *  length len; these strings are added to an ArrayList and returned.
	 *  If no strings have that length, return an empty ArrayList
	 *
	 *  @param wordChart  2D array of Strings
	 *  @parram len  the length of strings to search for
	 *  @return  an ArrayList containing all strings in wordChart with length len
	 */
	public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
		ArrayList<String> res = new ArrayList<String>();
		for (String[] row : wordChart)
			for (String item : row)
				if (item.length() == len)
					res.add(item);
		return res;
	}

	/** calculates and returns the average class grade as a double for a
	 *  all Students in the 2D array seatingChart
	 *
	 *  @param seatingChart  2D array of Student objects
	 *  @return  the average grade of all Students in seatingChart, as a double
	 */
	public static double classAverage(Student[][] seatingChart) {
		double sum = 0;
		for (Student[] row : seatingChart)
			for (Student student : row)
				sum += student.getGrade();
		return sum / (seatingChart.length * seatingChart[0].length);
	}

	/** Returns a new 2D array that contains all values in the 2D array arr
	 *  in reverse, such that the last value in the last row becomes the first
	 *  value in the first row, and so on.  This method does NOT modify arr, the
	 *  original 2D array object.
	 *
	 *  Example: if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
	 *  then this method returns the following 2D array:
	 *                     {{12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}}
	 *
	 *  @param arr  2D array of ints
	 */
	public static int[][] reverse(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[][] rev = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				rev[i][j] = arr[n - i - 1][m - j - 1];
		return rev;
	}

	/** Returns true if any two consecutive elements, horizontally or vertically,
	 *  are equal, false otherwise.  You do not need to check for "wrap around"
	 *  consecutiveness, such as if the last element in a row is the same as
	 *  the first:
	 *  
	 *  For example, if arr is:
	 *      1, 2, 3, 4
	 *      2, 7, 3, 5
	 *      3, 4, 5, 6
	 *
	 *  then this method returns true because there is a pair of consecutive
	 *  numbers (vertically)
	 *
	 *  As another example, if arr is:
	 *      1, 2, 3, 4
	 *      2, 7, 8, 5
	 *      3, 4, 4, 6
	 *
	 *  then this method returns true because there is a pair of consecutive
	 *  numbers (horizontally)
	 *
	 *  As another example, if arr is:
	 *      1, 2, 3, 8
	 *      2, 7, 8, 5
	 *      3, 2, 5, 3
	 *
	 *  then this method returns false because there are not two consecutive
	 *  numbers, vertically or horizontally, that are equal.
	 *
	 *  NOTE: do not consider "wrap around" consecutiveness, in other words,
	 *  the 3's and 2's below are not considered consecutive:
	 *      1, 2, 3, 8
	 *      2, 7, 8, 5
	 *      3, 2, 5, 3
	 *
	 *  Similarly, equal numbers on a diagonal are not considered consecutive,
	 *  so the 8's below are not consecutive:
	 *      1, 2, 3, 8
	 *      2, 7, 8, 5
	 *      3, 2, 5, 3
	 *
	 *  @param arr  2D array of ints
	 */
	public static boolean consecutive(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				if (i > 0 && arr[i][j] == arr[i - 1][j] ||
					j > 0 && arr[i][j] == arr[i][j - 1])
					return true;
		return false;
	}

	/** A magic square is a square grid filled with distinct positive integers
	 *  such that each element is a different integer, and the sum of the integers
	 *  in each row, column and diagonal is equal.  This method should return true
	 *  if arr is a magic square.
	 *
	 *  PRECONDITION: arr is a square 2D array with the same number of rows and
	 *                columns
	 *  
	 *  For example, if arr is:
	 *      7, 2, 3
	 *      0, 4, 8
	 *      5, 6, 1
	 *
	 *  then this method returns true because all numbers are unique (no duplicate
	 *  values) and each row, column, and diagonal add up to the same number (12)
	 *
	 *  As another example, if arr is (note the 3 and 2 swapped):
	 *      7, 3, 2
	 *      0, 4, 8
	 *      5, 6, 1
	 *
	 *  then this method returns false because the column sums no longer add up to
	 *  the same value
	 *
	 *  As another example, if arr is:
	 *      3, 3, 3
	 *      3, 3, 3
	 *      3, 3, 3
	 *  then this method returns false because although the sums are the same
	 *  along rows, columns, and diagonals, there are duplicate numbers.
	 *
	 *  @param arr  2D array of ints
	 */
	public static boolean magicSquare(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		// dups
		int[] unpck = new int[n * m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				unpck[i * m + j] = arr[i][j];
		sort(unpck);
		for (int i = 1; i < n * m; i++)
			if (unpck[i] == unpck[i - 1])
				return false;
		// get checksum
		int chksum = 0;
		for (int i = 0; i < m; i++)
			chksum += arr[0][i];
		// rows
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++)
				sum += arr[i][j];
			if (sum != chksum)
				return false;
		}
		// cols
		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++)
				sum += arr[j][i];
			if (sum != chksum)
				return false;
		}
		// dias
		int diSum1 = 0;
		for (int i = 0; i < n && i < m; i++)
			diSum1 += arr[i][i];
		int diSum2 = 0;
		for (int i = Math.min(n, m) - 1; i >= 0; i--)
			diSum2 += arr[i][i];
		return diSum1 == chksum && diSum2 == chksum;
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int tmp = arr[i];
			while (j > 0 && arr[j - 1] > tmp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = tmp;
		}
	}
}
