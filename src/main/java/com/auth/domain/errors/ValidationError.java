package com.auth.domain.errors;

public class ValidationError {
  private final ErrorType errorType;
  private final String errorMessage;

  public ValidationError(ErrorType errorType, String errorMessage) {
    this.errorType = errorType;
    this.errorMessage = errorMessage;
  }

  public ErrorType getErrorType() {
    return errorType;
  }

  public String getMessage() {
    return errorMessage;
  }

  public enum ErrorType {
    INVALID_USERNAME,
    INVALID_PASSWORD,
    USER_ALREADY_EXIST
  }
}
