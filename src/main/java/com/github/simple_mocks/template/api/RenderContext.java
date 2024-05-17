package com.github.simple_mocks.template.api;

/**
 * Interface define template render context
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface RenderContext {

    /**
     * Requested output type
     *
     * @return required output type
     */
    OutputType getOutputType();

}
