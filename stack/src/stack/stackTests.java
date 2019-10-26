package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stackTests {

	@Test
	void test() {
		stackTests pushTest = new stackTests();
		Stack testStack = new Stack(3);
		testStack.push(1);
		testStack.push(4);
		testStack.push(5);;
		assertEquals(testStack.pop(), 5);
	}

}
