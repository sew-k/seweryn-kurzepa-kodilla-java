package com.kodilla.stream.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorPrinterTestSuite {

    @Test
    void testMirrorPrinterAddTextAndMirroring() {
        //Given
        String textToProcess = "Abcdefg!";

        //When
        String result = MirrorPrinter.mirror(textToProcess);
        String expected = "!gfedcbA";

        //Then
        assertEquals(expected, result);

    }
}
