public class Stack {

	private char [] array = {};

	public void push(char c) {
		var copy = new char [array.length + 1];
		for(var i = 0; i < array.length; i ++) {
			copy[i] = array[i];
		}
		copy[copy.length - 1] = c;
		array = copy;
	}

	public char pop() {
		if(!isEmpty()) {
			var last = array[array.length - 1];

			var copy = new char[array.length - 1];
			for(var i =0; i < copy.length; i ++) {
				copy[i] = array[i];
			}
			array = copy;
			return last;
		}

		return '-';
	}

	public boolean isEmpty() {
		return array.length == 0;
	}
}