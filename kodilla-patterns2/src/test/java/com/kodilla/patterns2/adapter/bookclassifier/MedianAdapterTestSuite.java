package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){

        Set<Book> books = new HashSet<>();
        books.add(new Book("autor", "tytuł", 2000, "0"));
        books.add(new Book("autor", "tytuł", 2000, "1"));
        books.add(new Book("autor", "tytuł", 2001, "2"));
        books.add(new Book("autor", "tytuł", 2002, "3"));
        books.add(new Book("autor", "tytuł", 2003, "4"));
        books.add(new Book("autor", "tytuł", 2004, "5"));
        books.add(new Book("autor", "tytuł", 2004, "6"));

        MedianAdapter medianAdapter = new MedianAdapter();

        int result = medianAdapter.publicationYearMedian(books);
        System.out.println(result);

        assertEquals(2002, result);

    }
}
