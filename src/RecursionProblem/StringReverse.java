package RecursionProblem;

public class StringReverse {
	public static void main(String[] args) {

		String s = "ravi";
		String result = "";
		String reversed = reverseString(s, s.length() - 1, result);
		System.out.println("---" + reversed);

	}

	private static String reverseString(String s, int index, String result) {
		if (index == 0) {
			return result + s.charAt(index);

		}

		return reverseString(s, index - 1, result + s.charAt(index));

	}

}
