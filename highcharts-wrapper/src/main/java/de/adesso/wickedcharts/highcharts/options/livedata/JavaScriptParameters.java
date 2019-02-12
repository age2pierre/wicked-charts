/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.highcharts.options.livedata;

/**
 * Container class for passing javascript parameters to
 * {@link LiveDataSeries#update(LiveDataUpdateEvent)}.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public interface JavaScriptParameters {

	/**
	 * Returns the value of the given parameter or null.
	 * 
	 * @param parameterName
	 *          the name of the parameter. This name was specified when calling
	 *          {@link LiveDataSeries#addJavaScriptParameter(String, String)}.
	 * @return the value of the given parameter or null if the parameter does
	 *         not exist.
	 */
	String getParameterValue(final String parameterName);

}