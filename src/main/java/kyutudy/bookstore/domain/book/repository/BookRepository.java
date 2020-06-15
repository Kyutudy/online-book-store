package kyutudy.bookstore.domain.book.repository;

import kyutudy.bookstore.domain.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
