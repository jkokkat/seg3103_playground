import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private String fizzBuzz(int num){
		return "1";
	}

	@Test
	public void test_fizzBuzz1(){
		assertEquals("2", fizzBuzz(2));
	}
}