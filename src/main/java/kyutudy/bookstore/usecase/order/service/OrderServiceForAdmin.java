package kyutudy.bookstore.usecase.order.service;

import kyutudy.bookstore.usecase.order.dto.OrderFindRequest;
import kyutudy.bookstore.usecase.order.dto.OrderFindResponse;
import kyutudy.bookstore.usecase.order.repository.OrderRepositoryForAdmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceForAdmin {

    private final OrderRepositoryForAdmin orderRepositoryForAdmin;

    public OrderServiceForAdmin(OrderRepositoryForAdmin orderRepositoryForAdmin) {
        this.orderRepositoryForAdmin = orderRepositoryForAdmin;
    }

    public List<OrderFindResponse> getOrders(OrderFindRequest request) {
        throw new UnsupportedOperationException();
    }
}
