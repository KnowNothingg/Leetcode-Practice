public class Solutions{

    // If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
    public static void main(String[] args) {
        String v1 = "1";
        String v2 = "1.0";
        System.out.println(compareVersion(v1, v2));
    }

    public static int compareVersion(String version1, String version2) {
        version1 += ".0";
        version2 += ".0";
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int min = Math.min(v1.length, v2.length);
        for(int i = 0; i < min; i++){
            int ver1 = Integer.parseInt(v1[i]);
            int ver2 = Integer.parseInt(v2[i]);
            if(ver1 > ver2){
                return 1;
            }else if(ver1 < ver2){
                return -1;
            }
        }

        if(v1.length > v2.length){
            for(int i = min; i < v1.length; i++){
                if(Integer.parseInt(v1[i]) != 0)  return 1;
            }
            return 0;
        }else{
            for(int i = min; i < v2.length; i++){
                if(Integer.parseInt(v2[i]) != 0)  return -1;
            }
            return 0;
        }

        // if(v1.length == v2.length){
        //     return 0;
        // }else if(v1.length > v2.length){
        //     return 1;
        // }else{
        //     return -1;
        // }
    }
}