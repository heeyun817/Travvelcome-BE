package com.example.backend.apiPayload.code;

public interface BaseErrorCode {

  public ErrorReasonDTO getReason();

  public ErrorReasonDTO getReasonHttpStatus();
}