package com.jfreakp.user.dto;

public class NodeDTO {
    private String id;
    private String label;

    public NodeDTO(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() { return id; }
    public String getLabel() { return label; }
}