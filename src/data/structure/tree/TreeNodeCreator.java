package data.structure.tree;

public class TreeNodeCreator {
    public TreeNode createTreeNode(){
        TreeNode treeNode = new TreeNode('A');
        treeNode.setLeft(new TreeNode('B'));
        treeNode.setRight(new TreeNode('C'));
        treeNode.getLeft().setLeft(new TreeNode('D'));
        treeNode.getLeft().setRight(new TreeNode('E'));
        treeNode.getLeft().getRight().setLeft(new TreeNode('G'));
        treeNode.getRight().setRight(new TreeNode('F'));
        return  treeNode;
    }

}
