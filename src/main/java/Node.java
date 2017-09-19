import com.google.common.base.MoreObjects;

public class Node implements Comparable<Node> {
    private int frequency;
    private char value;
    private Node parent;
    private Node left;
    private Node right;

    public Node() {
    }

    public void setValue(char value) {
        this.value = value;
    }
    
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public char getValue() {
        return this.value;
    }
    
    public int getFrequency() {
        return this.frequency;
    }

    public Node getParent() {
        return this.parent;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    @Override
    public int compareTo(Node otherNode) {
        return this.frequency - otherNode.getFrequency();
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("Value", this.value)
                          .add("Frequency", this.frequency)
                          .add("Parent", this.parent)
                          .add("Left", this.left)
                          .add("Right", this.right)
                          .toString();
    }
}

