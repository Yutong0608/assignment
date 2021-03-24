package main;

import main.BinaryReversal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    @BeforeEach
    void setUp() {
        System.out.println("SetUp Method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("TearDown Method");
    }

    @Test
    void binaryToIntegerTest() {
        String str = "47";
        int result = BinaryReversal.binaryReversalProcessor(str);
        int res = 244;
        Assertions.assertEquals(res, result);
    }
}