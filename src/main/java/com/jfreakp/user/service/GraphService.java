package com.jfreakp.user.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.stereotype.Service;

import com.jfreakp.user.dto.GraphResponse;
import com.jfreakp.user.dto.LinkDTO;
import com.jfreakp.user.dto.NodeDTO;

import org.neo4j.driver.Result;

@Service
public class GraphService {
    private final Driver driver;

    public GraphService(Driver driver) {
        this.driver = driver;
    }

    public GraphResponse getGraph() {
        try (Session session = driver.session()) {
            Result result = session.run("MATCH (p)-[r]->(o) RETURN p, r, o LIMIT 25");

            Map<String, NodeDTO> nodeMap = new HashMap<>();
            List<LinkDTO> links = new ArrayList<>();

            while (result.hasNext()) {
                var record = result.next();
                var pNode = record.get("p").asNode();
                var oNode = record.get("o").asNode();
                var rel = record.get("r").asRelationship();

                String pId = String.valueOf(pNode.id());
                String oId = String.valueOf(oNode.id());

                nodeMap.putIfAbsent(pId, new NodeDTO(pId, pNode.labels().iterator().next()));
                nodeMap.putIfAbsent(oId, new NodeDTO(oId, oNode.labels().iterator().next()));

                links.add(new LinkDTO(pId, oId, rel.type()));
            }

            return new GraphResponse(new ArrayList<>(nodeMap.values()), links);
        }
    }
}
