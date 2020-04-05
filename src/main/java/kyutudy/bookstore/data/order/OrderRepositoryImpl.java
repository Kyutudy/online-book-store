package kyutudy.bookstore.data.order;

import kyutudy.bookstore.domain.order.domain.Order;
import kyutudy.bookstore.domain.order.repository.OrderRepository;
import kyutudy.bookstore.usecase.order.dto.OrderFindRequest;
import kyutudy.bookstore.usecase.order.repository.OrderRepositoryForAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository, OrderRepositoryForAdmin {
    @Override
    public List<Order> getOrderOf(long ordererId, OrderFindRequest request) {
        // TODO: Implement it
        throw new UnsupportedOperationException();
    }
}
