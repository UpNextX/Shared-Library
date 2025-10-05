package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.upnext.sharedlibrary.Enums.OrderStatus;
import org.upnext.sharedlibrary.Enums.PaymentMethod;
import org.upnext.sharedlibrary.Enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    Long orderId;
    Long userId;
    Double totalCost;
    PaymentStatus paymentStatus;
    OrderStatus orderStatus;
    PaymentMethod paymentMethod;
    LocalDateTime orderDate;
    LocalDateTime deliveryDate;
    List<OrderItemDto> orderItems;
}
