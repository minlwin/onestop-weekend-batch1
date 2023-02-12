public class CheckStringTest {

	public static void main(String[] args) {
		
		test("[]", true);
		test("[}", false);
		test("[]{}", true);
		test("[()]", true);
		test("[(){}]", true);
		test("[()", false);
		test("[(]", false);
	}

	static void test(String str, boolean expected) {

		// Execute Test Method
		boolean result = CheckString.isBalance(str);

		// Check & Show Result
		System.out.printf(
			"Input: \"%-8s\", Expected : %-6s, Result : %-6s (%s)%n",
			str, expected, result, (expected == result) ? "OK" : "NG"
		);
	}

}