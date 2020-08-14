package com.safetour.myapp.model;

public class tourDTO {
	private String Title;
	private String address;
	private double x;
	private double y;
	private String ImgPath;
	
	public tourDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public tourDTO(String title, String address, double x, double y, String imgPath) {
		super();
		Title = title;
		this.address = address;
		this.x = x;
		this.y = y;
		ImgPath = imgPath;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getImgPath() {
		return ImgPath;
	}

	public void setImgPath(String imgPath) {
		ImgPath = imgPath;
	}

	@Override
	public String toString() {
		return "recordDTO [Title=" + Title + ", address=" + address + ", x=" + x + ", y=" + y + ", ImgPath=" + ImgPath
				+ "]";
	}
	
	
}
