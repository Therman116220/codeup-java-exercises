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

    public static void main(String[] args) {
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
    }
}
