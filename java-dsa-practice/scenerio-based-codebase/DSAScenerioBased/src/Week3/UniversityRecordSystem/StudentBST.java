package Week3.UniversityRecordSystem;

class Node {
    int roll;
    String name;
    Node left, right;

    Node(int roll, String name) {
        this.roll = roll;
        this.name = name;
        left = right = null;
    }
}

public class StudentBST {
    Node root;

    // Insert student record
    Node insert(Node root, int roll, String name) {
        if (root == null)
            return new Node(roll, name);

        if (roll < root.roll)
            root.left = insert(root.left, roll, name);
        else if (roll > root.roll)
            root.right = insert(root.right, roll, name);

        return root;
    }

    // Search student by roll number
    Node search(Node root, int roll) {
        if (root == null || root.roll == roll)
            return root;

        if (roll < root.roll)
            return search(root.left, roll);

        return search(root.right, roll);
    }

    // Delete student record
    Node delete(Node root, int roll) {
        if (root == null)
            return root;

        if (roll < root.roll)
            root.left = delete(root.left, roll);
        else if (roll > root.roll)
            root.right = delete(root.right, roll);
        else {
            // one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // two children
            Node successor = minValue(root.right);
            root.roll = successor.roll;
            root.name = successor.name;
            root.right = delete(root.right, successor.roll);
        }
        return root;
    }

    Node minValue(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // Inorder traversal (sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.roll + " - " + root.name);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        StudentBST bst = new StudentBST();

        bst.root = bst.insert(bst.root, 105, "Rahul");
        bst.root = bst.insert(bst.root, 102, "Aditi");
        bst.root = bst.insert(bst.root, 108, "Neha");
        bst.root = bst.insert(bst.root, 101, "Aman");

        System.out.println("Sorted Student Records:");
        bst.inorder(bst.root);

        System.out.println("\nSearching Roll 102:");
        Node s = bst.search(bst.root, 102);
        if (s != null)
            System.out.println("Found: " + s.name);
        else
            System.out.println("Not Found");

        bst.root = bst.delete(bst.root, 105);

        System.out.println("\nAfter Deletion:");
        bst.inorder(bst.root);
    }
}

