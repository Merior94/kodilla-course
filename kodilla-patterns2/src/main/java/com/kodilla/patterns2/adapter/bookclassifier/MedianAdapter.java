package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();

        bookSet.forEach(b -> books.put(new BookSignature(String.valueOf(b.hashCode())),new Book(b.getAuthor(),b.getTitle(),b.getPublicationYear())));

        MedianAdaptee medianAdaptee = new MedianAdaptee();
        return medianAdaptee.medianPublicationYear(books);
    }
}
