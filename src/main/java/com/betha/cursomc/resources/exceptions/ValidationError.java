package com.betha.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String message, Long timestamp) {
        super(status, message, timestamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String fieldError) {
        this.errors.add(new FieldMessage(fieldName, fieldError));
    }
}
