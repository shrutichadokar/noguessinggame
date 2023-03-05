import java.util.Scanner;

 class noguessing {
	public static void
	numberguessinggame()
	{
		
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(100 * Math.random());
		
		int n = 10;

		int i, guess;

    System.out.println("A number is chosen" + " between the range of  1 to 100." + "Guess number" + " in 10 trials.");
	
		for (i = 0; i < n; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println(
					"Congrats🎉!" + " You have guessed the right number.");
				break;
			}
			else if (number > guess && i != n - 1) {
				System.out.println(
					"The number is " + "greater than " + guess);
			}
			else if (number < guess && i != n - 1) {
				System.out.println(
					"The number is" + " less than " + guess);
			}
		}

		if (i == n) {
			System.out.println(
				" Oops ☹ You have exhausted " + " n trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	public static void
	main(String arg[])
	{
		numberguessinggame();
	}
}