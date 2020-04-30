import java.util.ArrayList;

public class Solutions{
    public static void main(String[] args) {
        int[] piles = {3,7,2,3};

        System.out.println(stoneGame(piles));
    }


    // Brute force
    public static boolean stoneGame(int[] piles) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : piles){
            list.add(i);
        }

        int A = 0, L = 0, turn = 0;
        while(list.size()!= 0){
            int remove = -1;
            if(turn == 0){
                if(list.size() >= 2){
                    if(Math.max(list.get(0), list.get(1)) == list.get(0) 
                    && Math.max(list.get(list.size() - 2), list.get(list.size() - 1)) == list.get(list.size() - 1)){
                        A += Math.max(list.get(0), list.get(list.size() - 1));

                        if(list.get(0) >= list.get(list.size() - 1)){
                            remove = 0;
                        }else{
                            remove = list.size() - 1;
                        }
                    }else if(Math.max(list.get(0), list.get(1)) == list.get(1)){
                        A += list.get(list.size() - 1);
                        remove = list.size() - 1;
                    }else if(Math.max(list.get(list.size() - 2), list.get(list.size() - 1)) == list.get(list.size() - 2)){
                        A += list.get(0);
                        remove = 0;
                    }
                }else{
                    A += list.get(0);
                    list.remove(0);
                    break;
                }
                turn = 1;
            }else{
                if(list.size() >= 2){
                    if(Math.max(list.get(0), list.get(1)) == list.get(0) 
                    && Math.max(list.get(list.size() - 2), list.get(list.size() - 1)) == list.get(list.size() - 1)){
                        L += Math.max(list.get(0), list.get(list.size() - 1));

                        if(list.get(0) >= list.get(list.size() - 1)){
                            remove = 0;
                        }else{
                            remove = list.size() - 1;
                        }
                    }else if(Math.max(list.get(0), list.get(1)) == list.get(1)){
                        L += list.get(list.size() - 1);
                        remove = list.size() - 1;
                    }else if(Math.max(list.get(list.size() - 2), list.get(list.size() - 1)) == list.get(list.size() - 2)){
                        L += list.get(0);
                        remove = 0;
                    }
                } else{
                    L += list.get(0);
                    list.remove(0);
                    break;
                }

                list.remove(remove);
                remove = -1;
                turn = 0;
            }
        }

        return A > L;
    }

    public static boolean Answer2(int[] piles){
        return true;
    }
}
