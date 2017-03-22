/**
 * 
 */
package br.com.sitemesh.web.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 *
 * @author anderson.aristides
 *
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder
			.addDecoratorPath("/plain/*", "/templates/plain.jsp")
			.addDecoratorPath("/page/*", "/templates/page.jsp")
			.addDecoratorPath("/none/*", "/templates/none.jsp");
	}

}
