package uebungsblatt6;

public class huffmanNode {
    private final int frequency;
    private huffmanNode leftNode;
    private huffmanNode rightNode;
    public huffmanNode(huffmanNode leftNode, huffmanNode rightNode) {
        this.frequency = leftNode.getFrequency() + rightNode.getFrequency();
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getFrequency() {
        return frequency;
    }

    public huffmanNode getLeftNode(){
        return leftNode;
    }
    public huffmanNode getRightNode(){
        return rightNode;
    }
}
