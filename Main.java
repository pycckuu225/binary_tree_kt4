
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;
import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] a = new int[30];

        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        searchMinBinaryTree(a);

    }


    public static void searchMinBinaryTree(int[] arr){


        MyBinaryTree tree = new MyBinaryTree(new MyNode(arr[0]));

        for (int i = 1; i < arr.length; i++){
            tree.addNode(new MyNode(arr[i]));
        }

        System.out.println(tree.anyFindMin(tree.root));
        tree.printTree(tree.root, "", false);

    }


}