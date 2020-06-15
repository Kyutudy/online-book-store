package kyutudy.bookstore.domain.book;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import static java.util.Objects.requireNonNull;

@Entity
public class Book {
    private static final int NAME_LENGTH_LIMIT = 64;
    private static final int AUTHOR_LENGTH_LIMIT = 64;

    @Id
    private Long id;
    private String name;
    private String author;

    @Embedded
    private Price price;


    private Book() {
    }

    public Book(String name, String author, Price price) {
        amendName(name);
        amendAuthor(author);
        this.price = requireNonNull(price);
    }

    private void amendName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("책 이름에 Null 또는 Empty를 넣을 수 없습니다");
        }
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException("책 이름은 64글자를 넘을 수 없습니다");
        }
        this.name = name;
    }

    private void amendAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("작가 이름에 Null 또는 Empty를 넣을 수 없습니다");
        }
        if (author.length() > AUTHOR_LENGTH_LIMIT) {
            throw new IllegalArgumentException("작가 이름은 64글자를 넘을 수 없습니다");
        }
        this.author = author;
    }
}

