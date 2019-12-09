//package Algorithms;
//
//import com.sun.source.tree.BinaryTree;
//import com.sun.source.tree.ExpressionTree;
//import com.sun.source.tree.TreeVisitor;
//
//public class BinarySearchTree {
//
//        Node root;
//
//        public void addNode(int key, String name) {
//            Node newNode = new Node(key, name);
//
//
//            if(root == null) {
//                root = newNode;
//            }
//            else {
//                Node focusNode = root;
//                Node parent;
//                while (true) {
//                    parent = focusNode;
//                    if(key < focusNode.key) {
//                        focusNode = focusNode.leftChild;
//
//                        if(focusNode == null) {
//                            parent.leftChild = newNode;
//                            return;
//                        }
//                    }
//                    else {
//                        focusNode = focusNode.rightChild;
//                        if (focusNode == null) {
//                            parent.rightChild = newNode;
//                            return;
//                        }
//                    }
//
//                }
//
//            }
//
//        }
//
//        public void inOrderTraversal(Node focusNode) {
//            if(focusNode != null) {
//                inOrderTraversal(focusNode.leftChild);
//                System.out.println(focusNode);
//                inOrderTraversal(focusNode.rightChild);
//            }
//
//        }
//    public static void main(String[] args) {
//        BinaryTree theTree = new BinaryTree();
//
//        theTree.addNode(50, "Boss");
//        theTree.addNode(25, "VP");
//        theTree.addNode(15, "office manager");
//
//    }
//
//
//
//}
//
//class Node {
//    int key;
//    String name;
//
//    Node leftChild;
//    Node rightChild;
//
//    Node(int key, String name) {
//        this.key = key;
//        this.name = name;
//    }
//
//    public String toString() {
//        return name + "has a key " + key;
//    }
//}