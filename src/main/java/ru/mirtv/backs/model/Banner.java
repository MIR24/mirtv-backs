package ru.mirtv.backs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Banner extends GraphicObject {

	public Banner() {

	}

	public Banner(int id, String name, String href, String image, boolean active) {
		super(id, name, href, image, active);
	}
}
