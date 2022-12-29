package com.kodilla.exception.io;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("-------------------------------------------------------");
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
        System.out.println("-------------------------------------------------------");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println(" *** Preparing to execute test #" + testCounter);
    }

    @Test
    void testReadFile() {
        //given
        FileReader fileReader = new FileReader();

        //when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";

        //when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();

        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("niema.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow( () -> fileReader.readFile("names.txt"))
        );
    }
}
