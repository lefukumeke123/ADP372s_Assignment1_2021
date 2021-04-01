package za.ac.cput.ADP372s_Assignment1_2021;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
class TDDTest {


        private TDD person1;
        private TDD person2;
        private int Monday;
        private int Friday;

        @BeforeEach
        void setUp() {

            person1 = new TDD();
            person2 = new TDD();
            Monday = 10;
            Friday = 10;
        }

        @Test
        void testObjectIdentity() {
            assertSame(person1, person2);
        }

        @Test
        void testObjectEquality() {
            assertEquals(person1, person2);
        }

        @Test
        void failingTest() {
            fail("This test will fail");
            assertEquals(Monday, Friday);
        }


        @Test
        @Timeout(6)
        public void timeoutTest() throws InterruptedException {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Test passed within the given time");
        }

        @Disabled("This option is disabled")
        @Test
        void disablingTest() {
            assertTrue(2 > 0);
        }
    }
