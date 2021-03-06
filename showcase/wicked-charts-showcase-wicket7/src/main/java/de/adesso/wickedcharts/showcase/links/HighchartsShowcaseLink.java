
package de.adesso.wickedcharts.showcase.links;

import de.adesso.wickedcharts.showcase.HomepageHighcharts;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * Adds a link to the Highcharts showcase in the main page
 */
@SuppressWarnings("serial")
public class HighchartsShowcaseLink extends BookmarkablePageLink<Void> {

	public HighchartsShowcaseLink() {
		super("highchartShowcaseLink", HomepageHighcharts.class);
	}
}

