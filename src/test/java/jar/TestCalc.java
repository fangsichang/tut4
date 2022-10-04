package jar;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalc
        extends TestCase{
            // public CalcTest( String testName ){super( testName );}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCalc()
    {
        assertTrue( true );
    }

}


