//package BinarySearchTree;
//
//public class BSTRunner {
//
//    public static void main(String[] args) {
//        BinarySearchTree bst = new BinarySearchTree();
//
//        bst.insert(20);
//        bst.insert(10);
//        bst.insert(30);
//        bst.insert(5);
//        bst.insert(15);
//        bst.insert(25);
//        bst.insert(35);
//        bst.insert(-4);
//
//        System.out.println("preorder : ");
//        preorder(bst.root);
//        System.out.println();
//        System.out.println("inorder : ");
//        inorder(bst.root);
//        System.out.println();
//        System.out.println("postorder : ");
//        postorder(bst.root);
//    }
//
//    //LRN
//    private static void postorder(Node root) {
//        if(root == null) {
//            return;
//        }
//
//        postorder(root.low);
//        postorder(root.high);
//        System.out.print(root.data + "-->");
//    }
//
//    //NLR
//    private static void preorder(Node root) {
//        if(root == null) {
//            return;
//        }
//
//        System.out.print(root.data + "-->");
//        preorder(root.low);
//        preorder(root.high);
//    }
//
//    //LNR
//    private static void inorder(Node root) {
//        if(root == null) {
//            return;
//        }
//
//        inorder(root.low);
//        System.out.print(root.data + "-->");
//        inorder(root.high);
//    }
//
//}
