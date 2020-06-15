package kyutudy.bookstore.usecase.book.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class BookEditRequest {

    @NotNull
    private String name;

    @NotNull
    private String author;

    @NotNull
    private Integer price;

    private BookEditRequest() {}


}
