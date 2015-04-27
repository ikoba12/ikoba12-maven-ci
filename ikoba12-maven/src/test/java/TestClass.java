import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class TestClass {

	@Test
	public void simpleTest() {
		int a=0;
		int b=0;
		assertEquals(a, b);
	}
	@Test
	public void mockTest(){
		HelloWorld test=Mockito.mock(HelloWorld.class);
		Mockito.when(test.testMethod()).thenReturn(100);
		assertEquals(100, test.testMethod());
		
	}
}
