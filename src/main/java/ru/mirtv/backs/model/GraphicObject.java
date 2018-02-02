package ru.mirtv.backs.model;

public class GraphicObject {

	private int id;
	private String name;
	private String href;
	private String image;
	private boolean active;

	public GraphicObject() {

	}

	public GraphicObject(int id, String name, String href, String image, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.href = href;
		this.image = image;
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
