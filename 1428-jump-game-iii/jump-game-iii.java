import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentIndex = queue.poll();

            // If we reach an index with value 0, return true
            if (arr[currentIndex] == 0) {
                return true;
            }

            // Explore the next possible jumps
            int jumpForward = currentIndex + arr[currentIndex];
            int jumpBackward = currentIndex - arr[currentIndex];

            // Check and add forward jump if valid and not visited
            if (jumpForward >= 0 && jumpForward < n && !visited[jumpForward]) {
                visited[jumpForward] = true;
                queue.offer(jumpForward);
            }

            // Check and add backward jump if valid and not visited
            if (jumpBackward >= 0 && jumpBackward < n && !visited[jumpBackward]) {
                visited[jumpBackward] = true;
                queue.offer(jumpBackward);
            }
        }

        // If the queue is empty and we haven't found a 0, it's not reachable
        return false;
    }
}
