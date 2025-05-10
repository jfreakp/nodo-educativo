package com.jfreakp.user.dto;

public class NodeDTO {
	private String id;
	private String label;
	private String text1;

	public String getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public String getText1() {
		return text1;
	}

	public NodeDTO(String id, String label, String text1) {
		super();
		this.id = id;
		this.label = label;
		this.text1 = text1;
	}
}