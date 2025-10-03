package org.upnext.sharedlibrary.Dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemDto {
    private Long id;
    private ProductDto product;
    private Integer quantity;

}
