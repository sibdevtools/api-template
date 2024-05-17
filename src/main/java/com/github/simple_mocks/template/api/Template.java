package com.github.simple_mocks.template.api;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record Template(
        String id,
        String code,
        String description,
        String type,
        Map<String, Object> qualifiers,
        ZonedDateTime createdAt,
        ZonedDateTime modifiedAt
) {
}
