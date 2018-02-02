package ru.mirtv.backs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Background extends GraphicObject {

	private String color;

	public Background() {

	}

	public Background(int id, String name, String href, String image, String color, boolean active) {
		super(id, name, href, image, active);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
