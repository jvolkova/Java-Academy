public class Sum {
	
	public static void main (String[] args) {
		
		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			args[i] = args[i].trim();
			try {
				if (args[i].contains(" ")) {
					String[] vals = args[i].split(" ");
					for(int j = 0; j < vals.length; j++){
						sum = sum + Integer.parseInt(vals[j]);
					}
				}
			else {
				sum  = sum + Integer.parseInt(args[i]);
			}
			}
			catch (NumberFormatException nfe) {}
		}
		System.out.println("Result: " + sum);
	}
}
