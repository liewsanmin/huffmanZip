public class NodeBuilder {
    Node node;

    public NodeBuilder() {
        node = new Node(); 
    }

    public NodeBuilder withValue(char value) {
        node.setValue(value);
        return this;
    }

    public NodeBuilder withFrequency(int frequency) {
        node.setFrequency(frequency);
        return this;
    }

    public NodeBuilder withParent(Node parent) {
        node.setParent(parent);
        return this;
    }

    public NodeBuilder withLeft(Node left) {
        node.setLeft(left);
        return this;
    }

    public NodeBuilder withRight(Node right) {
        node.setRight(right);
        return this;
    }

    public Node build() {
        return node;        
    }
}

