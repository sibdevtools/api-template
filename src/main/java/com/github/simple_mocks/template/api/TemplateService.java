package com.github.simple_mocks.template.api;

import java.util.List;
import java.util.Map;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface TemplateService {

    /**
     * Create a new template.<br/>
     * Template type value examples:
     *     <ul>
     *         <li>FREEMAKER</li>
     *         <li>JASPER</li>
     *         <li>JS</li>
     *     </ul>
     * Template qualifier used as additional identifiers for the template instance.<br/>
     * If template with passed code and qualifiers already exists then {@link TemplateErrors#ALREADY_EXIST} will be thrown.
     *
     * @param code        template code
     * @param description template description
     * @param type        template type
     * @param qualifiers  template qualifiers
     * @param content     template content
     * @return created template identifier
     */
    String create(String code,
                  String description,
                  String type,
                  Map<String, Object> qualifiers,
                  byte[] content);

    /**
     * Delete a template by identifier.<br/>
     * In case if template not found {@link TemplateErrors#NOT_FOUND} will be thrown.
     *
     * @param templateId template identifier
     * @return true - template was deleted, false - otherwise
     */
    boolean delete(String templateId);

    /**
     * Get all template versions for template with passed code.
     *
     * @param code template code
     * @return list of all template versions with passed code
     */
    List<Template> getTemplates(String code);
}
