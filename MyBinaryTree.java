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
