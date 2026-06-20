# Data Structures and Algorithms

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

Tourist Sites (Vertices):
| Site | Coordinates |
| --- | --- |
| Train Station | (4,9) |

Walking Paths (Edges):
| From | To | Distance (km) |
| --- | --- | --- |
| Leisure Centre | Market Square | 0.9 |
| Peoples Park | Leisure Centre | 1.2 |
| St. Michael's Church | Peoples Park | 1.6 |
| Train Station | Library | 1.8 |

Four algorithms were implemented:
- Search(site): finds a site by name and returns its coordinates
- Insert(site1, site2, weight): adds a new walking path between two sites
- AllCons(site): lists all sites directly connected to a given site
- Closest(site): finds the nearest connected site by minimum edge weight

## Topics Covered
- Linked Lists
- Stacks
- Queues

## Purpose
To develop a deeper understanding of how data structures work and how they impact algorithm efficiency.

## What I learned
- Core principles of data organisation
- Problem-solving and algorithm design
- Time and space complexity basics
