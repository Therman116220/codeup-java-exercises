package sortingAlgorithms;

/*   Breadth-first search (BFS) OR "BREADTH-FIRST TRAVERSAL":
    *Begins at TREE root
    *Uses "Queue"
    *BFS (A traversing algorithm) traverses a tree data structure, starting from the root. Looking for a node that meets req. for task.
    - Start traversing from a SELECTED NODE, source OR STARTING NODE and traverse the "TREE" or "GRAPH", LAYER BY LAYER/Level By Level.
    Level:0
    Level:1
    Level:2
  */

import com.sun.source.tree.Tree;

public class BFSAlgorithm {


}





/*  BFS USES QUEUE
* Explore nodes and edges of graph.Often a building block in other algorithms.
* Time Commplexity- O(V+E)
* Basic Use- Finding 'shortest path on unweighted graphs'.
*
*How is BFS different from a DFS(Depth-First-Search)? A:How it explores the graph.
* BFS starts at a node in graph & explores its neighbor nodes
* As we explore all of 'i or nodes' neighbors, we should add them to the queue
* transition 'levels/layers'. and add all new neighor nodes/i to queue
* if we move on to a 'i' that has already been added to queue, skip it
* CONTINUES process until nodes are all cleared
* */


/*    public static void main(String[] args) {
        Tree root = new Tree(10);
        Tree newChild = root.addChild(5); //roots first child
        root.addChold(7);
        root.addChild(15);
        Tree newChildChild = newChild.addChild(80);
        Tree newChildChildChild = newChildChild.addChild(192);

        Tree foundNode = search(192,root); //BFS Search

        if(foundNode != null) {
            System.out.println(foundNode.getValue());
        } else {
            System.out.println("Nothing found here!");
        }
    }*/


