package de.adesso.wickedcharts.chartjs.chartoptions;

import java.io.Serializable;

import lombok.experimental.Accessors;

@Accessors(chain = true)
@lombok.Data
public class Title implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean display;
	private String text;
}
