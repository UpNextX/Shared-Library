package org.upnext.sharedlibrary.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.upnext.sharedlibrary.Enums.PaymentMethod;
import org.upnext.sharedlibrary.Enums.PaymentStatus;

// returns the placed order id and user id and payment status and the total amount to be paid
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPaymentDto {
    private Long orderId;
    private Long userId;
    private Double totalCost;
    private PaymentStatus paymentStatus;
}
