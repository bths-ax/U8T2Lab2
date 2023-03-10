import java.util.ArrayList;

public class Algorithm2DArraysRunner {
	public static void main(String[] args) {
		int[][] testArr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println(Algorithm2DArrays.isFound(testArr1, 5));
		System.out.println(Algorithm2DArrays.isFound(testArr1, 12));
		System.out.println(Algorithm2DArrays.isFound(testArr1, 13));


		String[][] words = {{"hi", "bye", "howl", "goo"}, {"time", "owl", "you", "good"}, {"map", "low", "bow", "mom"}};
		System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "o"));
		System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "ow"));
		System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "goo"));
		System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "map"));
		System.out.println(Algorithm2DArrays.countElementsWithSubstring(words, "gone"));


		int[][] testArr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};

		// method modifies original testArr2 object
		int changes = Algorithm2DArrays.replaceEvensWithZero(testArr2);
		System.out.println("Number of changes: " + changes);

		System.out.println("2D Array modified:");
		for (int[] row : testArr2) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}


		int[][] testArr3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
		System.out.println(Algorithm2DArrays.sumForRow(testArr3, 0));
		System.out.println(Algorithm2DArrays.sumForRow(testArr3, 1));
		System.out.println(Algorithm2DArrays.sumForRow(testArr3, 2));


		int[][] testArr4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
		System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 0));
		System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 1));
		System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 2));
		System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 3));
		System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 4));


		// the method will print the 2D array, and also return the 2D array
		int[][] returnedArr = Algorithm2DArrays.printNumberGrid(5, 6);

		System.out.println("-----------");

		// print the returned array (number grid), just to test that the
		// correct 2D array got returned -- this should print the same grid
		// that is printed by the method
		for (int[] row : returnedArr) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}


		String[][] xoGrid = Algorithm2DArrays.gridOfXandO(6);

		for (String[] row : xoGrid) {
			for (String val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------");
		String[][] xoGrid2 = Algorithm2DArrays.gridOfXandO(7);

		for (String[] row : xoGrid2) {
			for (String val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}


		String[][] words2 = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
		ArrayList<String> returnedList = Algorithm2DArrays.findStringsOfLength(words2, 3);
		System.out.println(returnedList);
		ArrayList<String> returnedList2 = Algorithm2DArrays.findStringsOfLength(words2, 4);
		System.out.println(returnedList2);
		ArrayList<String> returnedList3 = Algorithm2DArrays.findStringsOfLength(words2, 6);
		System.out.println(returnedList3);


		Student s1 = new Student("Abby", 95);
		Student s2 = new Student("Barb", 98);
		Student s3 = new Student("Cole", 91);
		Student s4 = new Student("Dave", 92);
		Student s5 = new Student("Ellie", 98);
		Student s6 = new Student("Frank", 87);
		Student s7 = new Student("George", 93);
		Student s8 = new Student("Jim", 92);
		Student s9 = new Student("Kara", 95);
		Student s10 = new Student("Lenny", 98);
		Student s11 = new Student("Mona", 100);
		Student s12 = new Student("Nancy", 99);
		Student[][] chart = {{s1, s2, s3}, {s4, s5, s6}, {s7, s8, s9}, {s10, s11, s12}};

		double avg = Algorithm2DArrays.classAverage(chart);
		System.out.println(avg);


		int[][] testArr5 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] reversed = Algorithm2DArrays.reverse(testArr5);
		System.out.println("Returned 2D array:");
		for (int[] row : reversed) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		System.out.println("\nOriginal 2D array NOT modified:");
		for (int[] row : testArr5) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}


		int[][] testArr6 = {{1, 2, 3, 4}, {2, 7, 3, 5}, {3, 4, 5, 6}};
		int[][] testArr7 = {{1, 2, 3, 4}, {2, 7, 8, 5}, {3, 4, 4, 6}};
		int[][] testArr8 = {{1, 2, 3, 8}, {2, 7, 8, 5}, {3, 2, 5, 3}};
		int[][] testArr9 = {{1, 2, 9, 9}, {2, 7, 8, 5}, {3, 2, 5, 3}};
		int[][] testArr10 = {{1, 2, 3, 8}, {0, 7, 8, 5}, {0, 2, 5, 3}};
		System.out.println(Algorithm2DArrays.consecutive(testArr6));
		System.out.println(Algorithm2DArrays.consecutive(testArr7));
		System.out.println(Algorithm2DArrays.consecutive(testArr8));
		System.out.println(Algorithm2DArrays.consecutive(testArr9));
		System.out.println(Algorithm2DArrays.consecutive(testArr10));


		int[][] testArr11 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
		int[][] testArr12 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
		int[][] testArr13 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
		int[][] testArr14 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		int[][] testArr15 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
		int[][] testArr16 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
		int[][] testArr17 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
		System.out.println(Algorithm2DArrays.magicSquare(testArr11));
		System.out.println(Algorithm2DArrays.magicSquare(testArr12));
		System.out.println(Algorithm2DArrays.magicSquare(testArr13));
		System.out.println(Algorithm2DArrays.magicSquare(testArr14));
		System.out.println(Algorithm2DArrays.magicSquare(testArr15));
		System.out.println(Algorithm2DArrays.magicSquare(testArr16));
		System.out.println(Algorithm2DArrays.magicSquare(testArr17));
	}
}
