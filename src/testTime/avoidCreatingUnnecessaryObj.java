package testTime;

public class avoidCreatingUnnecessaryObj {

	public static void main(String[] args) {
		/* (1)
		 * Reuse is better than create a new one
		 */
		String s = new String ("jack"); // Dont do this
		String s2 = "jack"; // Do this
		
		
		/* (2)
		 * Different between long and Long.
		 * declared as a Long: te program will constructs abt 2^31 unnecessary Long instances
		 * (roughly one for each time the long i is added to the Long sum)
		 */
		System.out.println("Start Test");
		final long startTime = System.currentTimeMillis();
		slow();
		//fast();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time  " + (endTime - startTime));
	}
	
	
	
	public static void slow() {

		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void fast() {
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	}
}
