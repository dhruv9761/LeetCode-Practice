class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(root,targetSum,0,ans,current);
        return ans; 
    }
    void solve(TreeNode root, int targetSum,int sum,List<List<Integer>> ans,List<Integer> current){
        if(root==null) return ;
        // current node ko path m add kro
        current.add(root.val);
        sum+=root.val;
        //check if current node is leaf
        if(root.left==null && root.right==null) {
            if(sum==targetSum){
                //copy of current add ki ans m,as current is mutable
                ans.add(new ArrayList<>(current));
            }
        }
        //explore left and right subtree
        solve(root.left,targetSum,sum,ans,current);
        solve(root.right,targetSum,sum,ans,current);
        //backtracking
        current.remove(current.size()-1);
    }
}