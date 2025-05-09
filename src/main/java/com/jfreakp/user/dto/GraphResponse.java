package com.jfreakp.user.dto;

import java.util.List;

public class GraphResponse {
    private List<NodeDTO> nodes;
    private List<LinkDTO> links;

    public GraphResponse(List<NodeDTO> nodes, List<LinkDTO> links) {
        this.nodes = nodes;
        this.links = links;
    }

    public List<NodeDTO> getNodes() { return nodes; }
    public List<LinkDTO> getLinks() { return links; }
}