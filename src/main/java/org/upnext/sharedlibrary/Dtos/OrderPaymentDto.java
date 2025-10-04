package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.upnext.sharedlibrary.Enums.PaymentMethod;

// returns the placed order id and user id and payment method and the total amount to be paid
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPaymentDto {
    private Long orderId;
    private Long userId;
    private PaymentMethod method;
    private Integer totalCost;
}
