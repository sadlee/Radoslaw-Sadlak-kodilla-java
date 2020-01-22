package com.kodilla.patterns222.adapter.bookclassifier;

import com.kodilla.patterns222.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns222.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("Sylvia Nasar",
                "A Beautiful Mind",
                1998,
                "FXYT123455"));
        bookA.add(new Book("Carl Sagan",
                "Congo",
                1980,
                "HDR765431"));
        bookA.add(new Book("David Sedaris",
                "Me Talk Pretty One Day",
                2000,
                "MNKPK987564"));
        bookA.add(new Book("Stephen King",
                "The Shining",
                1977,
                "ALN857463"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assert.assertEquals(1998, median);
    }
}