/**
 * 二叉树 节点类
 *      和 链表一样，也是以节点的形式来实现二叉树
 *      只不过，链表节点内容是： data + nextNode
 *      二叉树的内容是： left + data + right
 */
class TreeNode{
    private String data;
    private TreeNode left;
    private TreeNode right;

    //满参、无参 两种构造方法，不可部分有参构造。
    public TreeNode() {
    }
    public TreeNode(String data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //getter和setter
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
}

/**
 * 二叉树 类
 *      主要包括一些方法
 */
public class BinaryTree {
    private TreeNode root;//定义根节点

    //有参、无参 两种构造方法
    public BinaryTree(TreeNode root) {
        this.root = root;
    }
    public BinaryTree() {
    }

    //getter和setter
    public TreeNode getRoot() {
        return root;
    }
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 添加节点
     */
    public TreeNode addNode(String data, TreeNode left, TreeNode right){
        return new TreeNode(data,left,right);
    }

    /**
     * 查找父节点
     */
    public TreeNode getParent(TreeNode element){
        //先判断 根节点是否为空，以及查找节点是否就是根节点
        return (root == null || root == element) ? null : parent(root, element);
    }

    private TreeNode parent(TreeNode subTree, TreeNode element) {
        //判断 上节点 是否为空
        if (subTree == null){
            return null;
        }
        //判断是否直接为 上节点 的左或右 节点
        if (subTree.getLeft() == element || subTree.getRight() ==element){
            return subTree;
        }
        //通过递归的方式，先在左子树找，找不到，再在右子树找。
        TreeNode leftSubTree = parent(subTree.getLeft(),element);
        TreeNode rightSubTree = parent(subTree.getRight(),element);
        if ( leftSubTree != null){
            return leftSubTree;
        }else {
            return rightSubTree;
        }
    }
    /**
     * 查询节点个数
     */
    public int getSize(TreeNode node) {
        //根节点为空，则节点个数为0
        if (node == null){
            return 0;
        }else {
            //用递归的方式，递归到最下面的节点，没有子节点了，则会返回一个1，表示只有自己这个节点。
            int i = getSize(node.getLeft());
            int j = getSize(node.getRight());
            return i+j+1;
        }
    }

    /**
     * 查询树高度
     */
    public int getHeight(TreeNode node){
        if ( node == null){
            return 0;
        }else {
            //递归方式，和查询节点个数类似
            int i = getHeight(node.getLeft());
            int j = getHeight(node.getRight());
            //高度是最深的节点开始算，所以判断左右节点的高度哪个比较大，就返回它。
            return i > j ? (i+1) : (j+1);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder(TreeNode node){
        if (node != null){
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }
    /**
     * 中序遍历
     */
    public void midOrder(TreeNode node){
        if (node != null){
            midOrder(node.getLeft());
            System.out.println(node.getData());
            midOrder(node.getRight());
        }
    }
    /**
     * 后序遍历
     */
    public void postOrder(TreeNode node){
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }
}
