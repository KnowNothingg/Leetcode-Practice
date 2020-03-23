import java.util.Hashtable;
import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
        int[] arr1 = {10,2,5,3};
        int[] arr2 = {-2,0,10,-19,4,6,-8};
        int[] arr3 = {-2,0,10,-19,4,6,-8};
        int[] arr4 = {-10,12,-20,-8,15};
        // System.out.println(checkIfExist(arr2));
        System.out.println(Answer(arr2));

    }

    public static boolean checkIfExist(int[] arr) {
        boolean flag = false;
        int zeroCount = 0;
        Hashtable<Integer, Integer> map = new Hashtable<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            map.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++){
            if((map.containsKey(2 * arr[i]) && map.get(2 * arr[i]) != map.get(arr[i]))
            ){
                flag = true;
                return flag;
            }

            if((arr[i] % 2 == 0 && map.containsKey(arr[i] / 2))){
                if(arr[i] == 0 && zeroCount == 1){
                    flag = false;
                }else if(arr[i] == 0 && zeroCount == 2){
                    flag = true;
                    return flag;
                }
            }
        }

        return flag;
    }


    public static boolean Answer(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] * 2 == arr[j]){
                    return true;
                }
                if(arr[i] / 2 == arr[j] && arr[i] % 2 == 0){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkIfExist2(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==2 * arr[j] ){
                    return true;
                }
            }
        }
        return false;
    }
}