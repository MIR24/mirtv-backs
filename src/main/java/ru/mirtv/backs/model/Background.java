package ru.mirtv.backs.model;

public class Background {

	private int id;
	private String name;
	private String href;
	private String image;
	private String color;
	
	public Background() {
		
	}

	public Background(int id, String name, String href, String image, String color) {
		super();
		this.id = id;
		this.name = name;
		this.href = href;
		this.image = image;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
