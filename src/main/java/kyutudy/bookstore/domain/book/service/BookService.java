package kyutudy.bookstore.domain.book.service;

import kyutudy.bookstore.common.exception.NotFoundException;
import kyutudy.bookstore.domain.book.domain.Book;
import kyutudy.bookstore.domain.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void register(Book book) {
        bookRepository.save(book);
    }

    public Book getBookById(long id) {
        return bookRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
