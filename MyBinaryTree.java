public class MyBinaryTree {

    MyNode root;
    int countNode;
    int min;

    MyBinaryTree(MyNode root) {
        this.addNode(root);
    }

    public void addNode(MyNode myNode){
        countNode++;
        insertNode(root, myNode);

    }

    protected void insertNode(MyNode root, MyNode myNode){

        if (root == null){
            this.root = myNode;
        }
        else {
            if (myNode.value <= root.value) {
                if (root.left == null){
                    root.left = myNode;
                }
                else {
                    insertNode(root.left, myNode);
                }
            }
            else {
                if (root.right == null){
                    root.right = myNode;
                }
                else {
                    insertNode(root.right, myNode);
                }
            }
        }

    }



    public int findMax(MyNode root){
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return (Math.max(root.value, Math.max(leftMax, rightMax)));
    }

    public int anyFindMin(MyNode root){

        if (root.left != null){
            anyFindMin(root.left);
        }
        else {
            min = root.value;
        }
        return min;
    }

}
