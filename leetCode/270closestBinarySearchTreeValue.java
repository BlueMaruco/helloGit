/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
     int tmp;
    public int closestValue(TreeNode root, double target){
        double dis = Double.MAX_VALUE;
        findClosest(root,target,dis);
        return tmp;
    }

    public void findClosest(TreeNode root,double target, double dis){
        if(root==null)
            return;
        if(Math.abs(root.val - target)<=dis){
            tmp=root.val;
            dis=Math.abs(root.val - target);
        }
        if(root.val-target>0){
            findClosest(root.left,target,dis);
        }
        else{findClosest(root.right,target,dis);}
    }

}

/****much concise and easier solution *****/
public int closestValue(TreeNode root,double target){
     int ret = root.val;
     while(root!=null){
          if(Math.abs(root.val-target)<Math.abs(ret-target)){
              ret = root.val;
          }
          root = (root.val>target)?root.left:root.right;
     }
     return ret;
}
