package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = Set.of(
                new Book("Adam Mickiewicz", "Pan Tadeusz", 1834, "10293847"),
                new Book("Adam Mickiewicz", "Dziady", 1860, "10293848"),
                new Book("Adam Mickiewicz", "Konrad Wallenrod", 1828, "10293849"),
                new Book("Adam Mickiewicz", "Poezje1", 1822, "10293850"),
                new Book("Adam Mickiewicz", "Poezje2", 1823, "10293850")
        );

        MedianAdapter adapter = new MedianAdapter();

        //When
        int resultMedian = adapter.publicationYearMedian(bookSet);

        //Then
        Assertions.assertEquals(1828, resultMedian);
    }
}