package com.andersenlab;


public class Main {
    public static void main(String[] args) {
        Graph graph = getGraph();
        GraphSearch graphSearch = new GraphSearch();

        boolean result = graphSearch.find(graph, "Игорь", "Рома");
        System.out.println(result);
    }

    private static Graph getGraph() {
        Graph graph = new Graph();

        graph.addVertex("Рома");
        graph.addVertex("Вова");
        graph.addVertex("Костя");
        graph.addVertex("Женя");
        graph.addVertex("Аня");
        graph.addVertex("Игорь");

        graph.addNeighbour("Вова", "Костя");
        graph.addNeighbour("Вова", "Рома");
        graph.addNeighbour("Вова", "Игорь");

        graph.addNeighbour("Рома", "Костя");

        graph.addNeighbour("Костя", "Женя");

        graph.addNeighbour("Женя", "Аня");
        graph.addNeighbour("Женя", "Рома");

        graph.addNeighbour("Игорь", "Костя");

        return graph;
    }
}
