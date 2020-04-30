import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solutions{
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        lastStoneWeight(stones);
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = stones.length - 1; i >= 0; i--){
            que.offer(stones[i]);
        }

        while(que.size() > 1){
            int smash = que.poll() - que.poll();
           que.offer(smash);
        }

        return que.peek();
    }
}