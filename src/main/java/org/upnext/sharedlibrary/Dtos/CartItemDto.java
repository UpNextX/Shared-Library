package org.upnext.sharedlibrary.Dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDto {
    private Long id;
    private Long cartId;
    private ProductDto product;
    private Integer quantity;

}
