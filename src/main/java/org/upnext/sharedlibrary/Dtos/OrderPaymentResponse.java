package org.upnext.sharedlibrary.Dtos;

import lombok.Data;

@Data
public class OrderPaymentResponse {
    Long orderId;
    Long userId;
    Double amount;
    String url;
    String currency = "usd";
}
