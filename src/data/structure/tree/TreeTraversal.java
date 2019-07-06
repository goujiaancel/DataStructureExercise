package data.structure.tree;

public class TreeTraversal {

    //树的前序遍历
    private void preOrder(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        //先遍历树根
        System.out.print(treeNode.getValue());
        //前序遍历左子树
        preOrder(treeNode.getLeft());
        //前序遍历右子树
        preOrder(treeNode.getRight());
    }

    //树的中序遍历
    private void inOrder(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        //先遍历左子树
        inOrder(treeNode.getLeft());
        //遍历树根
        System.out.print(treeNode.getValue());
        //遍历右子树
        inOrder(treeNode.getRight());
    }

    //树的后序遍历
    private void postOrder(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        //遍历左边子树
        postOrder(treeNode.getLeft());
        //遍历右子树
        postOrder(treeNode.getRight());
        //遍历树根
        System.out.print(treeNode.getValue());
    }

    /**
     * 根据前序遍历和中序遍历求树
     */
    private TreeNode findTreeByPreAndIn(String preOrder , String inOrder) {
        if (preOrder.isEmpty()) {
            return null;
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);
        TreeNode treeNode = new TreeNode(rootValue);
        treeNode.setLeft(findTreeByPreAndIn(preOrder.substring(1, 1 + rootIndex)
                , inOrder.substring(0 , rootIndex)
        ));

        treeNode.setRight(findTreeByPreAndIn(preOrder.substring(1 + rootIndex)
                , inOrder.substring(1 + rootIndex)
                )
        );
        return treeNode;
    }

    public static void main(String[] args) {
        TreeNodeCreator treeNodeCreator = new TreeNodeCreator();
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.preOrder(treeNodeCreator.createTreeNode());
        System.out.println();
        treeTraversal.inOrder(treeNodeCreator.createTreeNode());
        System.out.println();
        //根据前序和中序求后续
        treeTraversal.postOrder(new TreeTraversal().findTreeByPreAndIn("ABDEGCF","DBGEACF"));
    }

}
