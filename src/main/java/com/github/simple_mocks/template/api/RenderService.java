package com.github.simple_mocks.template.api;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface RenderService {

    /**
     * Find template by passed qualifier and render it used render context.
     * <p>
     * In case if template not found {@link TemplateErrors#NOT_FOUND} will be thrown.
     * </p>
     *
     * @param templateQualifier template qualifier
     * @param renderContext     template render context
     * @return rendered template
     */
    Rendered render(TemplateQualifier templateQualifier, RenderContext renderContext);

    /**
     * Find template by template identifier and render it used render context.
     * <p>
     * In case if template not found {@link TemplateErrors#NOT_FOUND} will be thrown.
     * </p>
     *
     * @param templateId    template identifier
     * @param renderContext template render context
     * @return rendered template
     */
    Rendered render(String templateId, RenderContext renderContext);

}
