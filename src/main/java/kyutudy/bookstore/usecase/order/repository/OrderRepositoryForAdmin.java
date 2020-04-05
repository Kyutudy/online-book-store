package kyutudy.bookstore.usecase.order.repository;

import kyutudy.bookstore.domain.order.domain.Order;
import kyutudy.bookstore.usecase.order.dto.OrderFindRequest;

import java.util.List;

public interface OrderRepositoryForAdmin {

    List<Order> getOrderOf(long ordererId, OrderFindRequest request);
}
