package com.github.simple_mocks.template.api;

import com.github.simple_mocks.template.api.specifier.TemplateLatestSelector;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public record TemplateQualifier(
        String code,
        BiFunction<Template, Template, Template> selector,
        List<Predicate<Template>> predicates
) {
    /**
     * Contractor for creating qualifier without predicates
     *
     * @param code     template code
     * @param selector template selector
     */
    public TemplateQualifier(String code, BiFunction<Template, Template, Template> selector) {
        this(code, selector, Collections.emptyList());
    }

    /**
     * Contractor for creating qualifier without predicates and with default selector {@link TemplateLatestSelector}
     *
     * @param code template code
     */
    public TemplateQualifier(String code) {
        this(code, new TemplateLatestSelector(), Collections.emptyList());
    }
}
