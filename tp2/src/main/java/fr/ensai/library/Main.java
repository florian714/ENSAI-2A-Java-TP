package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);
        
        Library lesfousdulivre = new Library(
            "lesfousdulivre",
            loadBooksFromCSV("ENSAI-2A-Java-TP/tp2/src/main/resources/books.csv")
        )

        System.out.println(fellowshipOfTheRing.toString());
    }
}