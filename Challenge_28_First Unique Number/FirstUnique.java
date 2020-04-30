import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class FirstUnique {

    public HashMap<Integer, Integer> map;
    public Queue<Integer> queue;
       
    public FirstUnique(int[] nums) {
        map = new HashMap<Integer, Integer>();
        queue = new LinkedList<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            queue.add(i);
        }
    }
    
    public int showFirstUnique() {

        // !queue.isEmpty() && (map.get(queue.peek()) > 1) 的顺序有关系，如果反了，runtime error
        while(!queue.isEmpty() && (map.get(queue.peek()) > 1)){
            queue.poll();
        }

        if(queue.isEmpty()){
            return -1;
        }

        return queue.peek();
    }
    
    public void add(int value) {
        queue.add(value);
        map.put(value, map.getOrDefault(value, 0) + 1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        FirstUnique firstUnique = new FirstUnique(nums);
        System.out.println(firstUnique.showFirstUnique());
        firstUnique.add(5);
        System.out.println(firstUnique.showFirstUnique());
        firstUnique.add(2); 
        System.out.println(firstUnique.showFirstUnique());
        firstUnique.add(3);
        System.out.println(firstUnique.showFirstUnique());
    }
}