package RecursionProblem;

public class checkSortedArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 7, 5 };
		boolean isSorted = checkArray(a, a.length);
		System.out.println(isSorted);
	}

	private static boolean checkArray(int[] a, int index) {
		return (index <= 1) ? true : (a[index - 1] < a[index - 2] ? false : checkArray(a, index - 1));

	}

}
