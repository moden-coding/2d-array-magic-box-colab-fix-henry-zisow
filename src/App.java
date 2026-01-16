public class App {
	public static void main(String[] args) {
		int[][] a = {
				{ 1, 1, 1 },
				{ 1, 1, 1 },
				{ 1, 1, 1 }
		};
		System.out.println(isMagic(a)); // true
		int[][] b = {
				{ 1, 1, 2 },
				{ 3, 2, 3 },
				{ 1, 4, 1 }
		};
		System.out.println(isMagic(b)); // false
		int[][] c = {
				{ 1, 1, 1 },
				{ 2, 2, 2 }
		};
		System.out.println(isMagic(c)); // false
		int[][] d = {
				{ 8, 1, 6 },
				{ 3, 5, 7 },
				{ 4, 9, 2 }
		};
		System.out.println(isMagic(d)); // true
	}

	public static boolean isMagic(int[][] array) {
		int l = array.length;
		for (int i = 0; i < l; i++) {
			if (array[i].length != l) {
				return false;
			}
		}
		int magicSum = 0;
		for (int j = 0; j < l; j++) {
			magicSum += array[0][j];
		}
		for (int row = 0; row < l; row++) {
			int rowSum = 0;
			for (int col = 0; col < l; col++) {
				rowSum += array[row][col];
			}
			if (rowSum != magicSum) {
				return false;
			}
		}
		for (int row = 0; row < l; row++) {
			int colSum = 0;
			for (int col = 0; col < l; col++) {
				colSum += array[col][row];
			}
			if (colSum != magicSum) {
				return false;
			}
		}
		int firstDiagnolSum = 0;
		for (int row = 0; row < l; row++) {
			firstDiagnolSum += array[row][row];
		}
		if (firstDiagnolSum != magicSum) {
			return false;
		}
		int secondDiagnolSum = 0;
		for (int row = 0; row < l; row++) {
			secondDiagnolSum += array[row][(l - 1) - row];
		}
		if (secondDiagnolSum != magicSum) {
			return false;
		}
		return true;
	}

}
