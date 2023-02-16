package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Simple library");
        Book book1 = new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1885,1,12));
        Book book2 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz", LocalDate.of(1886,5,16));
        Book book3 = new Book("Pan Wołodyjowski", "Henryk Sienkiewicz", LocalDate.of(1883,12,19));
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException exception) {
            System.out.println(exception);
        }

        shallowCopyLibrary.setName(shallowCopyLibrary.getName() + " [shallowCopy] ");

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException exception) {
            System.out.println(exception);
        }

        deepCopyLibrary.setName(deepCopyLibrary.getName() + " [deepCopy] ");

        //When
        shallowCopyLibrary.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deepCopyLibrary);

        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, shallowCopyLibrary.getBooks().size());
        Assertions.assertEquals(3, deepCopyLibrary.getBooks().size());

    }
}
