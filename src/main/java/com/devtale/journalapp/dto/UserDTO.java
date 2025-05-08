package com.devtale.journalapp.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotEmpty
    @Schema(description = "The User's username")
    private String username;
    private String email;
    private boolean sentimentAnalysis;
    @NotEmpty
    private String password;
}
