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
public class OrderPaymentRequest {

    @NotNull(message = "Payment method cannot be null")
    private PaymentMethod paymentMethod;


}
