/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import tp2_tdd.MethodsClass;
import tp2_tdd.TDDClass;

/**
 *
 * @author Guest
 */
public class TDDJUnitTest {
    private static MethodsClass decimal;
    private static MethodsClass doubles;
    private static MethodsClass floats;
    private static MethodsClass nullness;
    private static TDDClass compareObjects;
    private static MethodsClass trueOrFalse;
    
    public TDDJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        decimal = new MethodsClass();
        doubles = new MethodsClass();
        floats = new MethodsClass();
        nullness = new MethodsClass();
        compareObjects = new TDDClass();
        trueOrFalse = new MethodsClass();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test(timeout=10)
    public void testDecimal(){
        int decimalNumber = 56;
        
        assertEquals(decimal.add(23, 33), decimalNumber);
    }
    
    @Test(timeout=10)
    public void testDouble(){
        double doubleNumber = 0.3f;
        
        assertEquals(doubles.subtract(0.5f, 0.2f), doubleNumber, 0.001f);
    }
    
    @Test(timeout=10)
    public void testFloat(){
        float floatNumber = 20;
        
        assertEquals(floats.multiple((float)5, (float)4), floatNumber, 0.001f);
    }
    
    @Test(timeout=20)
    public void testNull(){
        String string = null;
        assertNull(nullness.notBeNull(string));
        
    }
    
    @Test(timeout=20)
    public void testNotNull(){
        assertNotNull(nullness.notBeNull("Value"));
    }
    
    @Test(timeout=10)
    public void testMatch(){
        TDDClass objectMatch = new TDDClass("Constance","Simon");
        assertEquals(compareObjects.ObjectsTheSame(), objectMatch);
    }
    
    @Test(timeout=10)
    public void testMissMatch(){
        TDDClass objectMissMatch = new TDDClass("Waagied","Williams");
         assertNotSame(compareObjects.ObjectsTheSame(), objectMissMatch);
    }
    
    @Test(timeout=10)
    public void testTruth(){
        assertTrue(trueOrFalse.beTrue(1));
    }
    
    @Test(timeout=10)
    public void testFalse(){
        assertFalse(trueOrFalse.beTrue(0));
    }
    
    @Ignore ("It will fail, no matter what...")
    @Test(timeout = 0)
    public void testFail() {
        fail("This test is destined to fail...");
    }
}
