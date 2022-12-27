package pro.sky.java.services;

import org.springframework.stereotype.Service;
import pro.sky.java.model.Book;
import pro.sky.java.model.Genre;
import pro.sky.java.repositories.BookRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        Book book1 = new Book();

        book1.setGenre(null);

        Genre.valueOf("NOVEL");
        Genre value = Genre.values()[1];
        Genre.BIOGRAPHY.ordinal();


        return bookRepository.save(book);
    }


    public Book findBook(long id) {
        return bookRepository.findById(id).orEsleThrow(() -> new EntityNotFoundException());
    }

    public Book editBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    public Collection<Book> getAllBooks() {
        return bookRepository.findALl();
    }

    public Book findByName(String name) {
        return bookRepository.findByNameIgnoreCase(name);
    }

    public Collection<Book> findByAuthor(String author) {
        return bookRepository.findByAuthorContainsIgnoreCase(author);
    }

    public Collection<Book> findByNamePart(String part) {
        return bookRepository.findAllByNameContainsIgnoreCase(part);
    }
}
