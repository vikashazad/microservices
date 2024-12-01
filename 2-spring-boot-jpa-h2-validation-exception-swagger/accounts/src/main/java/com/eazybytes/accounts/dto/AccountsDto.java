package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
    name = "Accounts",
    description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

  @Schema(
      description = "Account Number of Eazy Bank account", example = "3454433243"
  )
  @NotEmpty(message = "Account can not be empty")
  @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be in 10 digits")
  private Long accountNumber;

  @Schema(
      description = "Account type of Eazy Bank account", example = "Savings"
  )
  @NotEmpty(message = "Account type can not be empty")
  private String accountType;

  @Schema(
      description = "Eazy Bank branch address", example = "123 NewYork"
  )
  @NotEmpty(message = "Branch address can not be empty")
  private String branchAddress;
}
