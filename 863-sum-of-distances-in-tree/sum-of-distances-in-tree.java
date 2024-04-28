import java.util.*;

class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        // Step 1: Build adjacency list
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.putIfAbsent(v, new ArrayList<>());
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        
        int[] subtreeSize = new int[n];
        int[] distanceSum = new int[n];
        
        // Step 2: DFS to calculate subtree sizes and distances
        dfs(0, -1, adjList, subtreeSize, distanceSum);
        
        // Step 3: DFS to update answer array
        int[] answer = new int[n];
        dfsUpdate(0, -1, adjList, subtreeSize, distanceSum, answer, 0);
        
        return answer;
    }
    
    // DFS to calculate subtree sizes and distances
    private void dfs(int node, int parent, Map<Integer, List<Integer>> adjList, int[] subtreeSize, int[] distanceSum) {
        subtreeSize[node] = 1;
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (neighbor != parent) {
                dfs(neighbor, node, adjList, subtreeSize, distanceSum);
                subtreeSize[node] += subtreeSize[neighbor];
                distanceSum[node] += distanceSum[neighbor] + subtreeSize[neighbor];
            }
        }
    }
    
    // DFS to update answer array
    private void dfsUpdate(int node, int parent, Map<Integer, List<Integer>> adjList, int[] subtreeSize, int[] distanceSum, int[] answer, int parentAnswer) {
        answer[node] = distanceSum[node] + parentAnswer;
        
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (neighbor != parent) {
                int newParentAnswer = answer[node] - distanceSum[neighbor] - subtreeSize[neighbor] + adjList.size() - subtreeSize[neighbor];
                dfsUpdate(neighbor, node, adjList, subtreeSize, distanceSum, answer, newParentAnswer);
            }
        }
    }
}
