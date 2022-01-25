/**
https://www.baeldung.com/java-binary-tree
How to implement a sorted binary tree in Java,
and its most common operations.
*/

import java.util.Queue;
import java.util.LinkedList;

class Node {
  int val;
  Node left;
  Node right;
  public Node(int val){
    this.val = val;
    left = null;
    right = null;
  }
}

class BinaryTree {
  Node root;

  private Node addRecursive(Node current, int val){
    if (current == null){
      return new Node(val);
    }

    if (val < current.val) {
      current.left = addRecursive(current.left, val);
    } else if (val > current.val) {
      current.right = addRecursive(current.right, val);
    } else { // value already exists
      return current;
    }

    return current;
  }
  public void add(int val){
    root = addRecursive(root, val);
  }

  private boolean containNodeRecursive(Node current, int val) {
    if (current == null) {
      return false;
    }
    if (val == current.val) {
      return true;
    }
    return val < current.val
      ? containNodeRecursive(current.left, val)
      : containNodeRecursive(current.right, val);
  }
  public boolean containNode(int val) {
    return containNodeRecursive(root, val);
  }

  private int findSmallestValue(Node root) {
    return root.left == null
    ? root.val
    : findSmallestValue(root.left);
  }
  private Node deleteRecursive(Node current, int val) {
    if (current == null) {
      return null;
    }

    if (val == current.val) {
      // Node to delete found
      if (current.left == null && current.right == null) {
        return null;
      }
      if (current.right == null) {
        return current.left;
      }
      if (current.left == null) {
        return current.right;
      }
      int smallestVal = findSmallestValue(current.right);
      current.val = smallestVal;
      current.right = deleteRecursive(current.right, smallestVal);
      return current;
    }
    if (val < current.val) {
      current.left = deleteRecursive(current.left, val);
      return current;
    }
    current.right = deleteRecursive(current.right, val);
    return current;
  }
  public void delete(int val) {
    root = deleteRecursive(root, val);
  }

  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.val);
      traverseInOrder(node.right);
    }
  }

  public void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(" " + node.val);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.val);
    }
  }

  public void traverseLevelOrder() {
    if (root == null) {
      return;
    }

    Queue<Node> nodes =  new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      Node node = nodes.remove();
      System.out.print(" " + node.val);
      if (node.left != null) {
        nodes.add(node.left);
      }
      if (node.right != null) {
        nodes.add(node.right);
      }
    }
  }
}

public class BinaryTreeDemo {

  public static void main(String args[]){
    BinaryTree bt = new BinaryTree();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    if (bt.containNode(6) == false) {
      System.out.println("Non OK");
    } else {
      System.out.println("OK");
    }
    if (bt.containNode(4) == false) {
      System.out.println("Non OK");
    } else {
      System.out.println("OK");
    }

    if (bt.containNode(1) == true) {
      System.out.println("Non OK");
    } else {
      System.out.println("OK");
    }

    bt.traverseInOrder(bt.root);
    System.out.println(" ");
    bt.traversePreOrder(bt.root);
    System.out.println(" ");
    bt.traversePostOrder(bt.root);
    System.out.println(" ");
    bt.traverseLevelOrder();
    System.out.println(" ");

    if (bt.containNode(9) == false) {
      System.out.println("Non OK");
    } else {
      System.out.println("OK");
    }
    bt.delete(9);
    if (bt.containNode(9) == true) {
      System.out.println("Non OK");
    } else {
      System.out.println("OK");
    }
  }
}
