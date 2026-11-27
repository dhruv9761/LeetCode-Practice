class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean valid = true;
        inOrder(root,ans);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i-1) >= ans.get(i)) return false; //
        }
        return true;
    }
    void inOrder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return ;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
}