package services;

import model.Node;
import java.util.ArrayList;

public class BSTreeToSkewedTree {

    private Node bstRoot;
    private Node rightSkewedRoot;

    public BSTreeToSkewedTree(Node bstRoot) {
        this.bstRoot = bstRoot;
        this.rightSkewedRoot = null;
    }

    public BSTreeToSkewedTree() {
        bstRoot = getHardCodedBst();
        rightSkewedRoot = null;
    }

    public Node convertBstToRightSkewed() {
        ArrayList<Integer> inOrderBst = convertBstToInOrderList();
        if(inOrderBst.isEmpty()){
            return rightSkewedRoot;
        }
        rightSkewedRoot = new Node(inOrderBst.get(0));
        Node currentNode = rightSkewedRoot;
        for (int i = 1; i < inOrderBst.size(); i++){
            currentNode = addToRightSkewedTree(currentNode, inOrderBst.get(i));
        }
        return rightSkewedRoot;
    }

    private Node addToRightSkewedTree(Node rightSkewedRoot, Integer integer) {
        rightSkewedRoot.right = new Node(integer);
        return rightSkewedRoot.right;
    }

    private ArrayList<Integer> convertBstToInOrderList() {
        ArrayList<Integer> list = new ArrayList<>();
        addNextInOrderNode(bstRoot, list);
        return list;
    }

    private void addNextInOrderNode(Node bstRoot, ArrayList<Integer> list) {
        if (bstRoot == null) {
            return;
        }
        addNextInOrderNode(bstRoot.left, list);
        list.add(bstRoot.data);
        addNextInOrderNode(bstRoot.right, list);
    }

    private Node getHardCodedBst() {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(10);
        root.right = new Node(60);
        root.right.left = new Node(55);
        return root;
    }

    public void printRightSkewedTree(Node rightSkewedRoot){
        if(rightSkewedRoot!=null){
            System.out.print(rightSkewedRoot.data + " ");
            printRightSkewedTree(rightSkewedRoot.right);
        }
    }
}