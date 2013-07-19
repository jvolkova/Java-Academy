public class Sum {
	
	public static void main (String[] args) {
		
		int sum = 0;
		
		for (String arg : args) {
			try {
				for (String val : arg.trim().split(" ")) {
					sum = sum + Integer.parseInt(val);
				}
			}
			catch (NumberFormatException nfe) {}
		}
		
		System.out.println("Result: " + sum);
	}
}
