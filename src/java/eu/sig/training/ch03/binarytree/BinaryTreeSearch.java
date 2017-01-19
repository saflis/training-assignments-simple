package eu.sig.training.ch03.binarytree;

import com.sun.xml.internal.messaging.saaj.soap.impl.TreeException;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else if (nodeValue < node.getValue()) {
            reCalculateDepth(node.getLeft(), nodeValue);
        } else {
            reCalculateDepth(node.getRight(), nodeValue);
        }
    }
    // end::calculateDepth[]

    private static int reCalculateDepth(BinaryTreeNode<Integer> pNode, int pNodeValue) {
        if (pNode == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(pNode, pNodeValue);
        }

    }
}
