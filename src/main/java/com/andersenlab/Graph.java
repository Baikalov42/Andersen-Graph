package com.andersenlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Vertex, List<Vertex>> vertices = new HashMap<>();

    void addVertex(String name) {
        vertices.putIfAbsent(new Vertex(name), new ArrayList<>());
    }

    void addNeighbour(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        vertices.get(v1).add(v2);
    }

    List<Vertex> getNeighbors(String name) {
        return vertices.get(new Vertex(name));
    }
}
