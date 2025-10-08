package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.upnext.sharedlibrary.Enums.OrderStatus;
import org.upnext.sharedlibrary.Enums.PaymentStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderStatusRequest {
    Long orderId;
    OrderStatus orderStatus;
    PaymentStatus paymentStatus;
}
