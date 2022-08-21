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
import com.sun.source.tree.TreeVisitor;

public class BFSAlgorithm {

    public static void main(String[] args) {
        Tree root = new Tree() {
            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }
        };


    }
}
