# Tourist Site Graph Navigator

A Java implementation of a weighted graph data structure applied to a real-world tourist navigation problem, mapping walking paths between sites in a town using an Edge List representation, Kruskal's MST algorithm, and four custom graph algorithms.

## Summary 
This project demonstrates practical application of graph data structures to a tourist navigation scenario. Seven tourist sites (vertices) are connected by weighted walking paths (edges), stored using an Edge List. Four algorithms are implemented to search, insert, find connections and locate the nearest site. A Minimum Spanning Tree is also derived using Kruskal's algorithm to find the most efficient network of paths connecting all sites.

## The Problem
How do you efficiently store and query a map of locations with distances between them? A standard array or list can't capture relationships between places. This Project addresses that by modelling a town's tourist sites as a graph where each site is a vertex with coordinates, and each walking path is a weighted edge representing distance in km.

The challenge was to implement this from scratch in Java (no libraries) and write algorithms that could search for a site, add new paths, find all connections, and identify the nearest neighbor.

## My Role & Contribution
- Designed and implemented the Graph, Vertex, and Edge classes
- Wrote all four core graph algorithms (Search, Insert, AllCons, Closest)
- Produced pseudocode for each algorithm
- Applied Kruskal's Minimum Spanning Tree algorithm to the graph, tracing each step manually
- Co-authored the project report with Tadhg Brennan

## Approach
The graph is stored using an Edge List consisting of an array of edges, each holding a start site, end site, and weight (distance in km). This is paired with a Vertex List storing each tourist site's name and (x,y) coordinates.

### Tourist Sites (Vertices):
| Site | Coordinates |
| --- | --- |
| Train Station | (4,9) |
| Library | (3, 7) |
| Market Square | (2, 4) |
| St. Michael's Church | (1, 6) |
| Leisure Centre | (6, 5) |
| Peoples Park | (5, 3) |
| Solas Eco Garden Centre | (4, 2) |

### Walking Paths (Edges):
| From | To | Distance (km) |
| --- | --- | --- |
| Leisure Centre | Market Square | 0.9 |
| Peoples Park | Leisure Centre | 1.2 |
| St. Michael's Church | Peoples Park | 1.6 |
| Train Station | Library | 1.8 |
| Library | St. Michael's Church | 2.0 |
| Market Square | Solas Eco Garden Centre | 2.3 |
| Solas Eco Garden Centre | Train Station | 3.1 |

#### Four algorithms were implemented:
- Search(site): finds a site by name and returns its coordinates
- Insert(site1, site2, weight): adds a new walking path between two sites
- AllCons(site): lists all sites directly connected to a given site
- Closest(site): finds the nearest connected site by minimum edge weight

Minimum Spanning Tree was calculated using Kruskal's Algorithm which sorts all edges by weight and adding them one by one, rejecting any edge that would form a cycle. The rejected edge was Solas Eco Garden Centre -> Train Station (3.1 km), as it would have closed a cycle. Total MST weight = 9.8 km across 6 edges.

## Challenges
- Cycle detection in Kruskal's required careful step-by-step menual tracing of the growing spanning tree to identify which edges would close a loop
- Ensuring AllCons and Closest checked both start and end of each edge was essential since the graph is undirected and paths go both ways
- Working without ArrayList or built-in graph libraries meant managing index counters (vertexCount, edgeCount) manually throughout

## Solution
```java
Graph g = new Graph();

g.addVertex("Train Station", 4, 9);
g.addVertex("Library", 3, 7);

g.Insert("Leisure Centre", "Market Square", 0.9);
g.Insert("Train Station", "Library", 1.8);

g.Search("Library");
g.AllCons("Leisure Centre");
g.Closest("Peoples Park");
```

### Sample Output:
```
Search() output:
Found site: Library at coordinates (3, 7)

AllCons() output:
Connections for: Leisure Centre
Connected to: Market Square with weight 0.9
Connected to: Peoples Park with weight 1.2

Closest() output:
Closest site to Peoples Park is Leisure Centre with weight 1.2
```

## Results
- All four algorithms produce correct output for the given graph data
- Kruskal's MST correctly identifies 6 edges (n-1 for 7 vertices) with a total weight of 9.8km
- The rejected edge (Solas Eco Garden Centre -> Train Station, 3.1km) was correctly identified as cycle forming
- Program exits with code 0 (no errors)

## Next Steps
- Implement Dijkstra's shortest path algorithm to find the optimal route between any two sites
- Replace fixed-size arrays with dynamic collections (ArrayList) to remove the 20-vertex/ 40-edge cap
- Add a visual GUI to display the graph map interactively
- Extend the hash table component (Part 1) to support delete and resize operations
- Generalise the system to accept any graph as input (e.g. via file or user input) rather than hardcoded data

## How to run
### Option 1: Run the JAR directly:
```bash
java -jar TadhgBrennanAndDanielBelovExe.jar
```
### Option 2: Compile from source:
```
javac Main.java Vertex.java Edge.java Graph.java
java Main
```

## Project Structure
```
├── Main.java                           # Driver class, builds the graph and runs all algorithms
├── Graph.java                          # Core graph class with Search, Insert, AllCons, Closest
├── Vertex.java                         # Vertex model (name, x, y coordinates)
├── Edge.java                           # Edge model (start, end, weight)
├── TadhgBrennanAndDanielBelovExe.jar   # Compiled executable
├── TadhgBrennanAndDanielBelovCode.pdf  # Full documented source code
├── TadhgBrennanAndDanielBelovReport.pdf # Project report with diagrams and analysis
└── README.md
```

## Built with
- Java 21
- IntelliJ IDEA
- No external libraries (pure Java implementation)
