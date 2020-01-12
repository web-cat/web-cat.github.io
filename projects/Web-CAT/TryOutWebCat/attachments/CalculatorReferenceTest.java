import junit.framework.*;

//-------------------------------------------------------------------------
/**
 *  Test class for Calculator.
 *
 *  @author  Stephen Edwards
 *  @version 2006.06.14
 */
public class CalculatorReferenceTest
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
    public void testSetValue1()
    {
        calc.setValue( 37 );
        assertEquals( calc.getValue(), 37 );
    }

    // ----------------------------------------------------------
    /**
     * Check setValue/getValue.
     */
    public void testSetValue2()
    {
        calc.setValue( 37 );
        assertEquals( calc.getValue(), 37 );
        calc.setValue( -42 );
        assertEquals( calc.getValue(), -42 );
    }

    // ----------------------------------------------------------
    /**
     * Check that clear returns the accumulator to zero.
     */
    public void testClear()
    {
        calc.setValue( 49 );
        calc.clear();
        assertEquals( calc.getValue(), 0 );
    }

    // ----------------------------------------------------------
    /**
     * Check that add works on zero and non-zero accumulators.
     */
    public void testAdd1()
    {
        calc.add( 49 );
        assertEquals( calc.getValue(), 49 );
    }

    // ----------------------------------------------------------
    /**
     * Check that add works on zero and non-zero accumulators.
     */
    public void testAdd2()
    {
        calc.add( 49 );
        assertEquals( calc.getValue(), 49 );
        calc.add( 40 );
        assertEquals( calc.getValue(), 89 );
    }

    // ----------------------------------------------------------
    /**
     * Check that subtract works on zero and non-zero accumulators.
     */
    public void testSubtract1()
    {
        calc.subtract( 49 );
        assertEquals( calc.getValue(), -49 );
    }

    // ----------------------------------------------------------
    /**
     * Check that subtract works on zero and non-zero accumulators.
     */
    public void testSubtract2()
    {
        calc.subtract( 49 );
        assertEquals( calc.getValue(), -49 );
        calc.subtract( -40 );
        assertEquals( calc.getValue(), -9 );
    }

    // ----------------------------------------------------------
    /**
     * Check that multiplyBy works on non-zero accumulators.
     */
    public void testMultiplyBy1()
    {
        calc.setValue( 1 );
        calc.multiplyBy( 5 );
        assertEquals( calc.getValue(), 5 );
    }

    // ----------------------------------------------------------
    /**
     * Check that multiplyBy works on non-zero accumulators.
     */
    public void testMultiplyBy2()
    {
        calc.setValue( 1 );
        calc.multiplyBy( 5 );
        assertEquals( calc.getValue(), 5 );
        calc.multiplyBy( 4 );
        assertEquals( calc.getValue(), 20 );
    }

    // ----------------------------------------------------------
    /**
     * Check that divideBy works on non-zero accumulators.
     */
    public void testDivideBy1()
    {
        calc.setValue( 100 );
        calc.divideBy( 5 );
        assertEquals( calc.getValue(), 20 );
    }

    // ----------------------------------------------------------
    /**
     * Check that divideBy works on non-zero accumulators.
     */
    public void testDivideBy2()
    {
        calc.setValue( 100 );
        calc.divideBy( 5 );
        assertEquals( calc.getValue(), 20 );
        calc.divideBy( 16 );
        assertEquals( calc.getValue(), 1 );
    }


    //~ Instance/static variables .............................................

    private Calculator calc;
}
