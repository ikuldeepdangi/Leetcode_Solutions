
class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // Initialize adjacency list
        List<Integer>[] adjList = new List[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        // Build adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList[u].add(v);
            adjList[v].add(u);
        }
        
        int[] subtreeSize = new int[n];
        int[] answer = new int[n];
        
        // Calculate subtree sizes and answer array in a single DFS pass
        dfs(0, -1, adjList, subtreeSize, answer);
        
        // Calculate answer array using the precomputed subtree sizes
        dfsUpdate(0, -1, adjList, subtreeSize, answer);
        
        return answer;
    }
    
    private void dfs(int node, int parent, List<Integer>[] adjList, int[] subtreeSize, int[] answer) {
        subtreeSize[node] = 1;
        for (int neighbor : adjList[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, adjList, subtreeSize, answer);
                subtreeSize[node] += subtreeSize[neighbor];
                answer[node] += answer[neighbor] + subtreeSize[neighbor];
            }
        }
    }
    
    private void dfsUpdate(int node, int parent, List<Integer>[] adjList, int[] subtreeSize, int[] answer) {
        for (int neighbor : adjList[node]) {
            if (neighbor != parent) {
                answer[neighbor] = answer[node] - subtreeSize[neighbor] + adjList.length - subtreeSize[neighbor];
                dfsUpdate(neighbor, node, adjList, subtreeSize, answer);
            }
        }
    }
}
