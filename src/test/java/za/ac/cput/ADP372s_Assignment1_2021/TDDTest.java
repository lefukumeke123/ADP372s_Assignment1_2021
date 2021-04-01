package za.ac.cput.ADP372s_Assignment1_2021;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Student Name: MARVIN LAMOHR
 * Student Number: 214273830
 */

class TDDTest {

    private TDDTest car1;
    private TDDTest car2;
    private TDDTest car3;
    private TDDTest car4;

    private TDDTest  shop1;
    private TDDTest  shop2;
    private TDDTest  shop3;


    @BeforeEach
    void setUp(){

        car1 = new TDDTest ();
        car2 = new TDDTest ();
        car3 = new TDDTest ();
        car4 = car2;


        shop1 = new TDDTest ();
        shop2 = shop3;

    }


    /* Testing For Object Equality */

    @Test
    void objectEquality(){

        assertEquals(car1,car1);
    }


    /* Testing For Object Identity */

    @Test
    void objectIdentity(){

        assertSame(car2,car4);

    }


    /* Making Sure The Test Fails */

    @Test
    void failingTest(){

        fail("Load-Shedding...Shutting-Down...");
        assertNotSame(shop1,car1);

    }


    /* Running Timeouts */

    @Test
    @Timeout(3)
    void timeOuts() throws InterruptedException {

        Thread.sleep(300);
        System.out.println("Test will pass soon... Please be patient...");
    }


    /* Initiating A Disabling Test */

    @Test
    @Disabled
    void disablingTest() throws InterruptedException{

        assertEquals(shop2,shop3);
        System.out.println("Exit");
    }

}