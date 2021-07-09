package com.agriarche.kasuwabackend;

import lombok.Data;

@Data
public class ErrorMessage {
    String message;
    Integer statusCode;
}
