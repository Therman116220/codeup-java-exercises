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

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSAlgorithm {
    public static void main(String[] args) {
       /* new BFSAlgorithm(search(4,));*/
    }
    public static Tree search(int value, Tree root) {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root); // add root node as the only queue member
        //CFS(Control Flow Statement - while loop/ If else)

        /*while Queue is !empty*/
        while (!queue.isEmpty()) {
            System.out.println("Queue number: ");
            for (Tree item: queue) {
                System.out.println();

                Tree presentNode = queue.remove(); // remove starting node & save as presentNode
                if (presentNode.getValue() == value) {
                    System.out.println("Finished searching ALL nodes!");
                    return presentNode;
                }
            }
        }
        return root;
    }


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





