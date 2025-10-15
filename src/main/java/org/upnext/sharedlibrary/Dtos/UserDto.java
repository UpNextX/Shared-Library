package org.upnext.sharedlibrary.Dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @NotNull(message = "User ID cannot be null")
    @Positive(message = "User ID must be positive")
    private Long id;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @NotBlank(message = "Role cannot be blank")
    @Pattern(
            regexp = "^(ADMIN|USER)$",
            message = "Role must be one of: ADMIN, USER, MANAGER, CUSTOMER"
    )
    private List<String> role;
}