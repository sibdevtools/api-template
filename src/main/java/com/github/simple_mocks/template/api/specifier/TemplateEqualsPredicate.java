package com.github.simple_mocks.template.api.specifier;

import com.github.simple_mocks.template.api.Template;
import lombok.AllArgsConstructor;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@AllArgsConstructor
public class TemplateEqualsPredicate implements Predicate<Template> {
    private final String qualifierCode;
    private final Object exceptedValue;

    @Override
    public boolean test(Template template) {
        return Optional.ofNullable(template.qualifiers())
                .map(it -> it.get(qualifierCode))
                .map(it -> Objects.equals(exceptedValue, it))
                .orElseGet(() -> exceptedValue == null);
    }
}
