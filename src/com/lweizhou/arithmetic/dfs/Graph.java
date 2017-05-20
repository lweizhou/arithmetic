package com.lweizhou.arithmetic.dfs;

import java.util.Stack;

public class Graph {

    private final int MAX_VERTS = 20;

    private Vertex[] vertexList;

    private int[][] adjMatrix; // adjacency matrix

    private int nVerts; // current number of vertices

    private Stack<Integer> stack = new Stack<>();

    public Graph() {

        vertexList = new Vertex[MAX_VERTS];
        adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
    }

    public void addVertex(Vertex v) {
        vertexList[nVerts++] = v;
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public int getAdjUnvisitedVertes(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMatrix[v][i] == 1 && !vertexList[i].wasVisited) {
                return i;
            }
        }
        return -1;
    }

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        // theS
    }



}
