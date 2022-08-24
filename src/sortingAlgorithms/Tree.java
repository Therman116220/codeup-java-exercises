package sortingAlgorithms;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
// Tree's are non-linear data structures
// A collection of nodes
// Often used to represent data in a hierarchical structure.
//ROOT,PARENT,CHILD,LEAF

/*Begin with root node*/


public class Tree {
    private int value;
    private List<Tree> child;


/*Constructor*/
    public Tree(int value) {
        this.value = value;
        this.child = new ArrayList<>();
    }
/*Generated Getters adding a return of this.*/

    public int getValue() {
        return this.value;
    }

    public List<Tree> getChild() {
        return child;
    }

public  Tree addChild(int value) {
        Tree newChild = new Tree(value);
        child.add(newChild);
        return newChild;
}





}
