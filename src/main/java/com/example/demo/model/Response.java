package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@Builder
public class Response {
    private Map<?,?> data;
    private HttpStatus status;
    private String error;
}
