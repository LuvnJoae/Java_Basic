public class Main {
    public static void main(String[] args) {

        /**
         * 两种方式创建二叉树，一种先创建一个 无参二叉树对象，
         * 通过add方法添加节点对象，最后再设置root节点
         */
//        BinaryTree tree = new BinaryTree();
//
//        TreeNode ll = tree.addNode("ll",null,null);
//        TreeNode lr = tree.addNode("lr", null, null);
//        TreeNode l = tree.addNode("l", ll, lr);
//        TreeNode r = tree.addNode("r", null, null);
//        TreeNode root = tree.addNode("root", l, r);
//
//        tree.setRoot(root);
        /**
         * 另一种方法，先创建节点对象，最后创建 有参二叉树对象
         */
        TreeNode ll = new TreeNode("left_left", null, null);
        TreeNode lr = new TreeNode("left_right", null, null);
        TreeNode l = new TreeNode("left", ll, lr);
        TreeNode r = new TreeNode("right", null, null);
        TreeNode root = new TreeNode("root", l, r);

        BinaryTree tree = new BinaryTree(root);

        /**
         * 二叉树类方法演示
         */
        //三种遍历
        System.out.println("-------前序遍历--------");
        tree.preOrder(root);
        System.out.println("-------中序遍历--------");
        tree.midOrder(root);
        System.out.println("-------后序遍历--------");
        tree.postOrder(root);

        //查找父节点
        System.out.println("--------查找父节点----------");
        TreeNode parent = tree.getParent(ll);
        System.out.println(parent.getData());

        //查询 节点 个数
        System.out.println("--------查询节点个数----------");
        int num = tree.getSize(root);
        System.out.println(num);

        //查询 树高度
        System.out.println("--------查询节点个数----------");
        int height = tree.getHeight(root);
        System.out.println(height);

    }
}
