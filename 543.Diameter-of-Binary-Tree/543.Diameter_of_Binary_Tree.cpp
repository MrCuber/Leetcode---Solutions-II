/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
int diameter = 0;
int diameterofTree(TreeNode* root) {
        if(!root) return 0;
        int left = diameterofTree(root->left);
        int right = diameterofTree(root->right);
        diameter = max(diameter, left+right);
        return 1+max(left, right);
}
    int diameterOfBinaryTree(TreeNode* root) {
        diameterofTree(root);
        return diameter;
    }
};