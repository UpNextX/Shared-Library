package org.upnext.sharedlibrary.Dtos;
import jakarta.validation.constraints.*;

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
    @NotNull(message = "Order ID cannot be null")
    @Positive(message = "Order ID must be positive")
    private Long orderId;

    @NotNull(message = "User ID cannot be null")
    @Positive(message = "User ID must be positive")
    private Long userId;

    @NotNull(message = "Total cost cannot be null")
    @PositiveOrZero(message = "Total cost must be zero or positive")
    private Double totalCost;

    @NotNull(message = "Payment status cannot be null")
    private PaymentStatus paymentStatus;

    @NotNull(message = "Payment method cannot be null")
    private PaymentMethod paymentMethod;

    private String paymentTransactionId;

}
