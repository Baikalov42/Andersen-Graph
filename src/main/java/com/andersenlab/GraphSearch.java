package com.andersenlab;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphSearch {

    public boolean find(Graph graph, String from, String searched) {
        Set<Vertex> cache = new HashSet<>();

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(new Vertex(from));

        Vertex current;
        while (!queue.isEmpty()) {
            current = queue.remove();

            if (current.getName().equals(searched)) {
                return true;
            } else {
                cache.add(current);
                queue.addAll(graph.getNeighbors(current.getName()));
                queue.removeAll(cache);
            }
        }
        return false;
    }
}
