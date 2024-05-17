package com.github.simple_mocks.template.api.specifier;

import com.github.simple_mocks.template.api.Template;
import lombok.AllArgsConstructor;

import java.util.function.BiFunction;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@AllArgsConstructor
public class TemplateLatestSelector implements BiFunction<Template, Template, Template> {

    @Override
    public Template apply(Template leftTemplate, Template rightTemplate) {
        var leftValue = leftTemplate.modifiedAt();

        var rightValue = rightTemplate.modifiedAt();

        if (leftValue.compareTo(rightValue) >= 0) {
            return leftTemplate;
        }
        return rightTemplate;
    }
}
