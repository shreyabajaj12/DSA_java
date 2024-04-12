//package shreya.java;
//
//import java.util.Scanner;
//
//public class lec93_trees {
//    public static class Node {
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//
//    private Node root;
//
//    public void populate(Scanner sc) {
//        System.out.println("Enter the root Node");
//        int value = sc.nextInt();
//        root = new Node(value);
//        populate(sc, root);
//    }
//
//    private void populate(Scanner sc, Node node) {
//        System.out.println("Do u want to enter left of " + node.value);
//        boolean left = sc.nextBoolean();
//        if (left) {
//            System.out.println("Enter the value " + node.value);
//            int value = sc.nextInt();
//            node.left = new Node(value);
//            populate(sc, node.left);
//        }
//        System.out.println("Do u want to enter right of " + node.value);
//        boolean right = sc.nextBoolean();
//        if (right) {
//            System.out.println("Enter the value " + node.value);
//            int value = sc.nextInt();
//            node.right = new Node(value);
//            populate(sc, node.right);
//        }
//
//    }
//
//    public void display() {
//        display(root, "");
//    }
//
//    private void display(Node node, String indent) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(indent + node.value);
//        display(node.left, indent + "\t");
//        display(node.right, indent + "\t");
//    }
//
//    public void prettyDisplay() {
//        preetyDisplay(root, 0);
//    }
//
//    private void preetyDisplay(Node node, int level) {
//        if (node == null) {
//            return;
//        }
//        prettyDisplay(node.right, level + 1);
//        if (level != 0) {
//            for (int i = 0; i < level - 1; i++) {
//                System.out.println("|\t\t");
//            }
//            System.out.println("|----------->" + node.value);
//        } else {
//            System.out.println(node.value);
//        }
//        prettyDisplay(node.left, level + 1);
//
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        lec93_trees tree=new lec93_trees();
//        tree.populate(sc);
//        tree.display();
//    }
//    }
//
