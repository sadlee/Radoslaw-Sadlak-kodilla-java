package com.kodilla.patterns222.adapter.bookclasifier;

import com.kodilla.patterns222.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns222.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns222.adapter.bookclasifier.libraryb.BookSignature;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns222.adapter.bookclasifier.librarya.Book> bookSet) {

        Map<BookSignature, Book> bookMap =
                new HashMap<>();
        for (com.kodilla.patterns222.adapter.bookclasifier.librarya.Book book : bookSet) {
            com.kodilla.patterns222.adapter.bookclasifier.libraryb.Book bookB =
                    new com.kodilla.patterns222.adapter.bookclasifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());

            bookMap.put(new BookSignature(book.getSignature()), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}