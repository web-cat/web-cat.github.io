import junit.framework.*;

//-------------------------------------------------------------------------
/**
 *  Test class for Calculator.
 *
 *  @author  Stephen Edwards
 *  @version 2006.06.14
 */
public class CalculatorTest
    extends TestCase
{
    //~ Setup .................................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Calculator object with zero in the accumulator.
     */
    public void setUp()
    {
        calc = new Calculator();
    }


    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that a new calculator starts off with a zero value.
     */
    public void testInitial()
    {
        assertEquals( calc.getValue(), 0 );
    }


    // ----------------------------------------------------------
    /**
     * Check setValue/getValue.
     */
    public void testSetValue()
    {
        // Add your own actions here ...
    }


    //~ Instance/static variables .............................................

    private Calculator calc;
}
