import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrinterTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void tearDown() throws Exception {
		System.setOut(System.out);
	}

	@Test
	void testPrintString() {
		String str = "Hello World!!!";
		Printer.printString(str);
		String expected = "Hello World!!!\n".replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
		assertEquals(expected, outContent.toString());
	}

	@Test
	void testPrintStringList() {
		List<String> strList = new ArrayList<>() ;
		strList.add("first word");
		strList.add("second word");
		Printer.printStringList(strList);
		String expected = "first word\nsecond word\n".replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
		assertEquals(expected, outContent.toString());
	}

}
