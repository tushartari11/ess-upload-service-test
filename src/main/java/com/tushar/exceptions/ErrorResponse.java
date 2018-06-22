package com.tushar.exceptions;

public class ErrorResponse {

    private Integer errorCode;
    private String errorMessage;
    private String errorDescription;

    public Integer getErrorCode() {
        return errorCode;
    }

    public ErrorResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public ErrorResponse setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
}
