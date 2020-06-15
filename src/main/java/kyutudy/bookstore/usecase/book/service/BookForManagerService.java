package kyutudy.bookstore.usecase.book.service;

import kyutudy.bookstore.domain.book.domain.Book;
import kyutudy.bookstore.domain.book.domain.Price;
import kyutudy.bookstore.domain.book.service.BookService;
import kyutudy.bookstore.usecase.book.dto.BookEditRequest;
import kyutudy.bookstore.usecase.book.dto.BookRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookForManagerService {

    private final BookService bookService;

    public void register(BookRegisterRequest request) {
        bookService.register(new Book(
                request.getName(),
                request.getAuthor(),
                new Price(request.getPrice())
        ));
    }

    public void edit(long id, BookEditRequest request) {
        Book book = bookService.getBookById(id);
        book.edit(
                request.getName(),
                request.getAuthor(),
                new Price(request.getPrice())
        );
    }
}
