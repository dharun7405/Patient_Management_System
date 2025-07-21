package com.pm.authservice.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class LoginResponseDTO {
    private final String token;
}
