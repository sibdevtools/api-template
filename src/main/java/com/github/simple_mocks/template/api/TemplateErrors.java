package com.github.simple_mocks.template.api;

import com.github.simple_mocks.error_service.exception.ServiceError;
import jakarta.annotation.Nonnull;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public enum TemplateErrors implements ServiceError {
    /**
     * The requested element not found
     */
    NOT_FOUND,
    /**
     * Some element already exists and cannot be created
     */
    ALREADY_EXIST;


    @Nonnull
    @Override
    public String getSystemCode() {
        return "TEMPLATE";
    }

    @Nonnull
    @Override
    public String getErrorCode() {
        return name();
    }
}
