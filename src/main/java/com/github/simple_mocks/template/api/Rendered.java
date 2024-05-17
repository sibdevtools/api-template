package com.github.simple_mocks.template.api;

import java.time.Duration;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface Rendered {

    /**
     * Information about used template
     *
     * @return instance of used template
     */
    Template getTemplate();

    /**
     * Get rendered template content
     *
     * @return content
     */
    byte[] getContent();

    /**
     * Used amount of time to render template
     *
     * @return time to render template
     */
    Duration getRenderDuration();

}
