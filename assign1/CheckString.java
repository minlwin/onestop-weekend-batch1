public class CheckString {

	// "[", "]", "{", "}", "(", ")"
	// "[]", "{}", "()"
	// "[](){}"
	// "[(){}]", "[({})]"
	public static boolean isBalance(String string) {

		// Split to char array
		char [] array = string.toCharArray();
		Stack opens = new Stack();

		for(char c : array) {

			// Check char open or close
			if(isOpen(c)) {
				// put new open char to opens array
				opens.push(c);
			} else {

				// If there is no open for target close char
				char open = opens.pop();
				if(!match(open, c)) {
					return false;
				}
			}
		}

		return opens.isEmpty();
	}

	static boolean match(char open, char close) {
		return (open == '[' && close == ']') 
			|| (open == '{' && close == '}') 
			|| (open == '(' && close == ')');
	}

	static boolean isOpen(char c) {
		return c == '[' || c == '{' || c == '(';
	}
}