package main;

import services.BSTreeToSkewedTree;
import model.Node;

public class Transaction {
    public static void main(String[] args) {
        BSTreeToSkewedTree bsTreeToSkewedTree = new BSTreeToSkewedTree();
        Node rightSkewed = bsTreeToSkewedTree.convertBstToRightSkewed();
        bsTreeToSkewedTree.printRightSkewedTree(rightSkewed);
    }
}
