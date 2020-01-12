#ifndef __INSTRUCTOR__TEST_
#define __INSTRUCTOR__TEST_

#include <cxxtest/TestSuite.h>
#include "Calculator.h"

//-------------------------------------------------------------------------
/**
 *  Test class for Calculator.
 *
 *  @author  Stephen Edwards
 *  @version 2006.06.14
 */
class __instructor__test :
    public CxxTest::TestSuite
{
public:
    // ----------------------------------------------------------
    /**
     * Check that a new calculator starts off with a zero value.
     */
    void testInitial()
    {
        Calculator calc;
        TS_ASSERT_EQUALS( calc.getValue(), 0 );
    }

    // ----------------------------------------------------------
    /**
     * Check setValue/getValue.
     */
    void testSetValue1()
    {
        Calculator calc;
        calc.setValue( -42 );
        TS_ASSERT_EQUALS( calc.getValue(), -42 );
    }

    // ----------------------------------------------------------
    /**
     * Check setValue/getValue.
     */
    void testSetValue2()
    {
        Calculator calc;
        calc.setValue( 37 );
        TS_ASSERT_EQUALS( calc.getValue(), 37 );
        calc.setValue( -42 );
        TS_ASSERT_EQUALS( calc.getValue(), -42 );
    }

    // ----------------------------------------------------------
    /**
     * Check that clear returns the accumulator to zero.
     */
    void testClear()
    {
        Calculator calc;
        calc.setValue( 49 );
        calc.clear();
        TS_ASSERT_EQUALS( calc.getValue(), 0 );
    }

    // ----------------------------------------------------------
    /**
     * Check that add works on zero and non-zero accumulators.
     */
    void testAdd1()
    {
        Calculator calc;
        calc.add( 49 );
        TS_ASSERT_EQUALS( calc.getValue(), 49 );
    }

    // ----------------------------------------------------------
    /**
     * Check that add works on zero and non-zero accumulators.
     */
    void testAdd2()
    {
        Calculator calc;
        calc.add( 49 );
        TS_ASSERT_EQUALS( calc.getValue(), 49 );
        calc.add( 40 );
        TS_ASSERT_EQUALS( calc.getValue(), 89 );
    }

    // ----------------------------------------------------------
    /**
     * Check that subtract works on zero and non-zero accumulators.
     */
    void testSubtract1()
    {
        Calculator calc;
        calc.subtract( 49 );
        TS_ASSERT_EQUALS( calc.getValue(), -49 );
    }

    // ----------------------------------------------------------
    /**
     * Check that subtract works on zero and non-zero accumulators.
     */
    void testSubtract2()
    {
        Calculator calc;
        calc.subtract( 49 );
        TS_ASSERT_EQUALS( calc.getValue(), -49 );
        calc.subtract( -40 );
        TS_ASSERT_EQUALS( calc.getValue(), -9 );
    }

    // ----------------------------------------------------------
    /**
     * Check that multiplyBy works on non-zero accumulators.
     */
    void testMultiplyBy1()
    {
        Calculator calc;
        calc.setValue( 1 );
        calc.multiplyBy( 5 );
        TS_ASSERT_EQUALS( calc.getValue(), 5 );
    }

    // ----------------------------------------------------------
    /**
     * Check that multiplyBy works on non-zero accumulators.
     */
    void testMultiplyBy2()
    {
        Calculator calc;
        calc.setValue( 1 );
        calc.multiplyBy( 5 );
        TS_ASSERT_EQUALS( calc.getValue(), 5 );
        calc.multiplyBy( 4 );
        TS_ASSERT_EQUALS( calc.getValue(), 20 );
    }

    // ----------------------------------------------------------
    /**
     * Check that divideBy works on non-zero accumulators.
     */
    void testDivideBy1()
    {
        Calculator calc;
        calc.setValue( 100 );
        calc.divideBy( 5 );
        TS_ASSERT_EQUALS( calc.getValue(), 20 );
    }

    // ----------------------------------------------------------
    /**
     * Check that divideBy works on non-zero accumulators.
     */
    void testDivideBy2()
    {
        Calculator calc;
        calc.setValue( 100 );
        calc.divideBy( 5 );
        TS_ASSERT_EQUALS( calc.getValue(), 20 );
        calc.divideBy( 16 );
        TS_ASSERT_EQUALS( calc.getValue(), 1 );
    }
};

#endif /*__INSTRUCTOR__TEST_*/
