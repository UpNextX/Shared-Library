package org.upnext.sharedlibrary.Dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessfulPaymentEvent {
    private Long userId;
    private Long orderId;
    private String paymentTransactionId;
}
