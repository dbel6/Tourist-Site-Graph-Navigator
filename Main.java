public class Main
{
    public static void main(String[] args)
    {
        // create a new graph
        Graph g = new Graph();

        // add vertices (tourist sites) to the graph
        g.addVertex("Train Station", 4, 9);
        g.addVertex("Library", 3, 7);
        g.addVertex("Market Square", 2, 4);
        g.addVertex("St. Michael's Church", 1, 6);
        g.addVertex("Leisure Centre", 6, 5);
        g.addVertex("Peoples Park", 5, 3);
        g.addVertex("Solas Eco Garden Centre", 4, 2);

        // insert edges (walking paths) between the sites
        g.Insert("Leisure Centre", "Market Square", 0.9);
        g.Insert("Peoples Park", "Leisure Centre", 1.2);
        g.Insert("St. Michael's Church", "Peoples Park", 1.6);
        g.Insert("Train Station", "Library", 1.8);
        g.Insert("Library", "St. Michael's Church", 2.0);
        g.Insert("Market Square", "Solas Eco Garden Centre", 2.3);

        // test for the implemented algorithms with sample data
        System.out.println();
        g.Search("Library");
        System.out.println();
        g.AllCons("Leisure Centre");
        System.out.println();
        g.Closest("Peoples Park");
    }
}
