import java.util.HashMap;

class Solutions {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i] + 1)){
                count++;
                // if(map.get(arr[i] + 1) == 1){
                //     map.remove(arr[i] + 1);
                // }else{
                //     map.put(arr[i] + 1, map.get(arr[i] + 1) - 1);
                // }
            }
        }

        return count;
    }

}