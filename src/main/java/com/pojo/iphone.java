package com.pojo;

public class iphone {
	
	private String size;
	private String lize;
	@Override
	public String toString() {
		return "iphone [size=" + size + ", lize=" + lize + "]";
	}
	public iphone(String size, String lize) {
		super();
		this.size = size;
		this.lize = lize;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLize() {
		return lize;
	}
	public void setLize(String lize) {
		this.lize = lize;
	}

	
}
