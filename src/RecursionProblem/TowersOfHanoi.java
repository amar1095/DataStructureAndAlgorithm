package RecursionProblem;

public class TowersOfHanoi {

	public static void main(String[] args) {

		int noOfDisk = 3;
		towersOfHanoiProblem(noOfDisk, "s", "h", "d");
		System.out.println();

	}

	private static void towersOfHanoiProblem(int n, String src, String helper, String destination) {

		if (n == 1) {
			System.out.println("disk transfer " + n + " from source " + src + " to destination " + destination);
			return;
		}

		towersOfHanoiProblem(n - 1, src, helper, destination);
		System.out.println("disk transfer " +n+ " from source " + src + " to destination " +destination);
		towersOfHanoiProblem(n - 1, helper, src, destination);

	}

}
