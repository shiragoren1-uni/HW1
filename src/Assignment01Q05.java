public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int verticesNum = m.length;
        int[] distances = new int[verticesNum];
        for (int k = 0; k < verticesNum; k++) {
            distances[k] = -1;
        }
        findShortestPathHelper(m, i, 0, distances);
        return distances[j];
    }

    private static void findShortestPathHelper(int[][] m, int start, int distanceYet, int[] distances) {
        if (distanceYet >= distances[start] && distances[start] != -1) {
            return;
        }
        else {
            distances[start] = distanceYet;
        }
    
        for (int k = 0; k < m.length; k++) {
            if (m[start][k] == 1) {
                findShortestPathHelper(m, k, distanceYet + 1, distances);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}