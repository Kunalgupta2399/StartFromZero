package BinarySearchTree;


public class BinarySearchTree {


    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int input) {
        Node node = new Node(input);

        //if the tree is empty
        if (root == null) {
            root = node;
            System.out.println(input + " added to the tree.");
            return;
        }

        if (input > root.data) {
            //input in the higher sub tree
            if (root.right == null) {
                root.right = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.right);
            }
        } else {
            //input in the lower sub tree
            if (root.left == null) {
                root.left = node;
                System.out.println(input + " added to the tree.");
            } else {
                insertAt(node, root.left);
            }
        }
    }

    private void insertAt(Node node, Node root) {
        if (node.data > root.data) {
            //input in the higher sub tree
            if (root.right == null) {
                root.right = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.right);
            }
        } else {
            //input in the lower sub tree
            if (root.left == null) {
                root.left = node;
                System.out.println(node.data + " added to the tree.");
            } else {
                insertAt(node, root.left);
            }
        }
    }

    public boolean search(int input) {
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.right);
            } else {
                return searchAt(input, root.left);
            }
        }
    }

    private boolean searchAt(int input, Node root) {
        if (root == null) {
            return false;
        }
        if (root.data == input) {
            return true;
        } else {
            if (input > root.data) {
                return searchAt(input, root.right);
            } else {
                return searchAt(input, root.left);
            }
        }
    }
}
