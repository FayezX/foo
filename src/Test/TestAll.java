package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ItemTest.class,OrderLineTest.class,OrderTest.class,CalculatorTest.class})
public class TestAll{
}
