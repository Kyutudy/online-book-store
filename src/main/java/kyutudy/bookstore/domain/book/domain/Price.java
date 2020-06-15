package kyutudy.bookstore.domain.book.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Price {

    private long price;

    private Price() {
    }

    public Price(long price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }
}
