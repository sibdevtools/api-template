package com.github.simple_mocks.template.api.specifier;

import com.github.simple_mocks.template.api.Template;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiFunction;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@AllArgsConstructor
public class TemplateMinSelector implements BiFunction<Template, Template, Template> {
    private final String qualifierCode;
    private final Comparator<Object> comparator;

    @Override
    public Template apply(Template leftTemplate, Template rightTemplate) {
        var leftValue = Optional.ofNullable(leftTemplate.qualifiers())
                .map(it -> it.get(qualifierCode))
                .orElse(null);

        var rightValue = Optional.ofNullable(rightTemplate.qualifiers())
                .map(it -> it.get(qualifierCode))
                .orElse(null);

        if (leftValue == null && rightValue == null) {
            return null;
        }
        if (leftValue == null) {
            return rightTemplate;
        }
        if (rightValue == null) {
            return leftTemplate;
        }
        if (comparator.compare(leftValue, rightValue) <= 0) {
            return leftTemplate;
        }
        return rightTemplate;
    }
}
