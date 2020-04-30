
class Solutions {

    public static void main(String[] args) {
        System.out.println(uniquePathsMemo(3, 2));
        // int[] nums = new int[m + n];

    }


    // Time Limit Exceeded
    public static int uniquePaths(int m, int n) {
       if(m == 1 || n == 1) return 1;
       return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }


    public static int uniquePathsMemo(int m, int n){
        // List<Integer> list = new ArrayList<>();
        // list.add(m);
        // list.add(n);

        // List<Integer> reverseList = new ArrayList<>();
        // list.add(n);
        // list.add(m);
        // if(map.containsKey(list) || map.containsKey(reverseList)){
        //     return map.get(list);
        // }
        // int result = 0;
        // if(m == 1 || n == 1){
        //     result = 1;
        // }else{
        //     result = uniquePathsMemo(m-1, n, map) + uniquePathsMemo(m, n-1, map);
        // }
        // List<Integer> goal = new ArrayList<>();
        // goal.add(1);
        // goal.add(1);
        // return map.get(goal);
        // // return uniquePathsMemo(m-1, n, map) + uniquePathsMemo(m, n-1, map);

        int[][] map = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1;  j <= n; j++){
                if(i == 1 || j == 1){
                    map[i][j] = 1;
                }else{
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
            }
        }
        return map[m][n];
    }
}